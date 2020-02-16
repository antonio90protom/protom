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
import com.protom.mytime.dao.TimesheetDao;
import com.protom.mytime.dto.TimesheetDto;
import com.protom.mytime.entity.DettaglioTS;
import com.protom.mytime.entity.LogStato;
import com.protom.mytime.entity.Stato;
import com.protom.mytime.entity.Timesheet;

@Repository
public class TimesheetDaoImpl implements TimesheetDao {

	@PersistenceContext
	EntityManager em;

	@Autowired
	private ModelMapper modelMapper;


	@Override /*
				 * Preleva i dati dei timesheet e il loro stato relativi ad un utente di cui passiamo l'username
				 */
	public List<TimesheetDto> findTimesheetbyUser(String username) {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<TimesheetDto> query = criteria.createQuery(TimesheetDto.class);
		Root<Timesheet> root = query.from(Timesheet.class);
		Join <Timesheet, DettaglioTS> tsdts = root.join("dettagli");
		Join <Timesheet, LogStato> tsls = root.join("stati");
		Join <LogStato, Stato> lss = tsls.join("id_stato");
		query.where(criteria.equal(root.get("username"), username));
		query.distinct(true);
		query.select(criteria.construct(TimesheetDto.class, root.get("id_timesheet"), root.get("username"),
				root.get("username_approvatore"), tsdts.get("codiceCommessa"), root.get("periodo"), lss.get("id_stato")));
		TypedQuery<TimesheetDto> result = em.createQuery(query);
		return result.getResultList();
	}

	@Override /*
				 * Query per prelevare i dati relativi al timesheet di una commessa sapendo l'id
				 * dell'approvatore
				 */
	public List<TimesheetDto> findByApprovatore(String username_approvatore) {
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<TimesheetDto> query = criteria.createQuery(TimesheetDto.class);
		Root<Timesheet> root = query.from(Timesheet.class);
		Join<Timesheet, DettaglioTS> Det = root.join("dettagli");
		query.where(criteria.equal(root.get("username_approvatore"), username_approvatore));
		query.distinct(true);
		query.select(criteria.construct(TimesheetDto.class, root.get("id_timesheet"), root.get("username"),
				root.get("username_approvatore"), Det.get("codiceCommessa"), root.get("periodo")));
		TypedQuery<TimesheetDto> result = em.createQuery(query);
		return result.getResultList();

	}

	@Override
	@Transactional
	public TimesheetDto save(TimesheetDto timesheet) {
		em.persist(modelMapper.map(timesheet, Timesheet.class));
		return timesheet;
	}

	@Override
	@Transactional 
	public TimesheetDto update(TimesheetDto timesheet) {
		em.merge(modelMapper.map (timesheet, Timesheet.class));
		return null;
	}

	@Override
	public TimesheetDto delete() {
		return null;
	}

}
