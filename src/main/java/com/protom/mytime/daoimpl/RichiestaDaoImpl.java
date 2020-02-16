package com.protom.mytime.daoimpl;

import java.util.Date;
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

import com.protom.mytime.dao.RichiestaDao;
import com.protom.mytime.dto.RichiestaDto;
import com.protom.mytime.entity.DettaglioTS;
import com.protom.mytime.entity.Richiesta;
import com.protom.mytime.entity.Timesheet;
import com.protom.mytime.entity.TipologiaRichiesta;

@Repository
public class RichiestaDaoImpl implements RichiestaDao {

	@PersistenceContext
	EntityManager em;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	@Transactional
	public RichiestaDto save(RichiestaDto richiesta) {
		em.persist(modelMapper.map(richiesta, Richiesta.class));
		return richiesta;
	}

	@Override
	@Transactional
	public RichiestaDto update(RichiestaDto richiesta) {
		em.merge(modelMapper.map(richiesta, Richiesta.class));
		return richiesta;
	}

	@Override /*Query che trova le richieste di uno specifico Utente di cui si inserisce lo username come parametro*/
	public List<RichiestaDto> findRequestsbyUser(String username) {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<RichiestaDto> query = criteria.createQuery(RichiestaDto.class);
		Root<Richiesta> root = query.from(Richiesta.class);
		Join<Richiesta, DettaglioTS> DTS = root.join("dettaglio");
		Join<DettaglioTS, Timesheet> Tim = DTS.join("timesheet");
		Join<Richiesta, TipologiaRichiesta> Tip = root.join("id_tipologiarichiesta");
		query.where(criteria.equal(Tim.get("username"), username));
		query.select(criteria.construct(RichiestaDto.class, root.get("id_richiesta"), root.get("noleggio_auto"),
				root.get("richiesta_taxi"), root.get("note"), Tip.get("descrizione_tipologiarichiesta")));
		TypedQuery<RichiestaDto> result = em.createQuery(query);
		return result.getResultList();
	}

	@Override
	public List<RichiestaDto> findRequestsByDate(Date dataScelta) {
		return null;
	}

	@Override /*Query che preleva le richieste in base alla tipologia*/
	public List<RichiestaDto> findRequestsbyType(int id_tipologiarichiesta) {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<RichiestaDto> query = criteria.createQuery(RichiestaDto.class);
		Root<Richiesta> root = query.from(Richiesta.class);
		Join <Richiesta, TipologiaRichiesta> ric = root.join("id_tipologiarichiesta");
		query.where(criteria.equal(ric.get("id_tipologiarichiesta"), id_tipologiarichiesta));
		query.select(criteria.construct(RichiestaDto.class, root.get("id_richiesta"), ric.get("descrizione_tipologiarichiesta"), root.get("noleggio_auto"), 
				root.get("richiesta_taxi"), root.get("note")));
		TypedQuery<RichiestaDto> result = em.createQuery(query);
		return result.getResultList();
	}
}