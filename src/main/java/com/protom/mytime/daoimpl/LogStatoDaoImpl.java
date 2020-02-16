package com.protom.mytime.daoimpl;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.protom.mytime.dao.LogStatoDao;
import com.protom.mytime.dto.LogStatoDto;
import com.protom.mytime.entity.LogStato;
import com.protom.mytime.entity.Stato;
import com.protom.mytime.entity.Timesheet;

@Repository
public class LogStatoDaoImpl implements LogStatoDao{

	@PersistenceContext
	EntityManager em;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override /* Mostra una lista di LogStati non ancora completati, in quanto la data fine del Log è assente (NULL) */
public List<LogStatoDto> findLastStatus () {			
			CriteriaBuilder cb = em.getCriteriaBuilder();
			CriteriaQuery<LogStatoDto> query = cb.createQuery(LogStatoDto.class);
			Root<LogStato> LS = query.from(LogStato.class);
			Join <LogStato, Timesheet> Time_Log = LS.join("timesheet");
			Join<LogStato,Stato> Sat = LS.join("id_stato");
			query.where(cb.isNull(LS.get("data_fine")));
			query.select(cb.construct(LogStatoDto.class, LS.get("id_logstato"), Time_Log.get("id_timesheet"), LS.get("user_utenteins"), LS.get("user_utentemod"), LS.get("data_inizio"),LS.get("data_fine"),LS.get("note"), Sat.get("id_stato"),Sat.get("descrizione_stato")));
			TypedQuery<LogStatoDto> result = em.createQuery(query);
			return  result.getResultList();
		}

	@Override
	@Transactional
	public LogStatoDto save(LogStatoDto logStato) {
		em.persist(modelMapper.map(logStato, LogStato.class));
		return logStato;
	}

	@Override
	@Transactional
	public LogStatoDto update(LogStatoDto logStato) {
		em.merge(modelMapper.map(logStato, LogStato.class));
		return logStato;
	}

	@Override /*Query che preleva le informazioni relative alle commesse che si trovano in un dato Stato */
	public List<LogStatoDto> findByStatus(Integer idStato) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<LogStatoDto> query = cb.createQuery(LogStatoDto.class);
		Root<LogStato> LS = query.from(LogStato.class);
		Join<LogStato,Stato> Sat = LS.join("id_stato");
		/*Join <Timesheet, DettaglioTS> Det = TS.join("dettagli");*/
		query.where(cb.equal(Sat.get("id_stato"),idStato));
		query.select(cb.construct(LogStatoDto.class, LS.get("id_logstato"),LS.get("data_inizio"),LS.get("data_fine"),LS.get("note"), Sat.get("descrizione_stato"), Sat.get("id_stato")));
		TypedQuery<LogStatoDto> result = em.createQuery(query);
		return  result.getResultList();
	}

	@Override /*Query che, attraverso l'id di un Timesheet, restituisce il suo LogStato*/
	public List<LogStatoDto> findLogByTimesheet(Integer id_timesheet) {
		CriteriaBuilder builder=em.getCriteriaBuilder();
		CriteriaQuery<LogStatoDto> query = builder.createQuery(LogStatoDto.class);
		Root<LogStato> root = query.from(LogStato.class);
		Join <LogStato, Stato> LS = root.join("id_stato");
		query.where(builder.equal(root.get("timesheet"), id_timesheet ));
		query.select(builder.construct(LogStatoDto.class, root.get("id_logstato"),root.get("user_utenteins"),root.get("user_utentemod"),root.get("data_inizio"),root.get("data_fine"),LS.get("descrizione_stato"), root.get("note")));
		TypedQuery<LogStatoDto> tq = em.createQuery(query);
		return tq.getResultList();
	}

	


}
