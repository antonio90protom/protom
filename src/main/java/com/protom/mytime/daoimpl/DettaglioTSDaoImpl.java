package com.protom.mytime.daoimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.protom.mytime.dao.DettaglioTSDao;
import com.protom.mytime.dto.DettaglioTSDto;
import com.protom.mytime.entity.DettaglioTS;

@Repository
public class DettaglioTSDaoImpl implements DettaglioTSDao {

	@PersistenceContext
	EntityManager em;

	@Autowired /* Crea un punto di Injection */
	private ModelMapper modelMapper;

	@Override
	@Transactional /*
					 * L'annotation Transactional fa in modo che le transazioni vengano gestite
					 * automaticamente dal container di Spring
					 */
	public DettaglioTSDto save(DettaglioTSDto dettaglio) {
		em.persist(modelMapper.map(dettaglio, DettaglioTS.class));
		return dettaglio;
	}

	@Override
	@Transactional
	public DettaglioTSDto update(DettaglioTSDto dettaglio) {
		em.merge(modelMapper.map(dettaglio, DettaglioTS.class));
		return dettaglio;
	}

	@Override /*
				 * Query che mostra i dati relativi alle commesse che sono in corso in una
				 * determinata data
				 */
	public List<DettaglioTSDto> findByDate(Date data) {
		List<Predicate> conditionsList = new ArrayList<Predicate>();
		CriteriaBuilder criteria = em.getCriteriaBuilder();
		CriteriaQuery<DettaglioTSDto> query = criteria.createQuery(DettaglioTSDto.class);
		Root<DettaglioTS> root = query.from(DettaglioTS.class);
		Predicate onStart = criteria.greaterThanOrEqualTo(root.get("data_fine"), data);
		Predicate onEnd = criteria.lessThanOrEqualTo(root.get("data_inizio"), data);
		conditionsList.add(onStart);
		conditionsList.add(onEnd);
		query.where(conditionsList.toArray(new Predicate[] {}));
		query.select(criteria.construct(DettaglioTSDto.class, root.get("id_dettaglio"), root.get("codiceCommessa"), root.get("task"),
				root.get("data_inizio"), root.get("data_fine"), root.get("ora_inizio"), root.get("ora_fine"),
				root.get("sede"), root.get("note")));
		return em.createQuery(query).getResultList();
	}

	@Override /* Relativi ad un timesheet di cui diamo in input l'ID */
	public List<DettaglioTSDto> getDetailByTimesheet(Integer idTime) {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<DettaglioTSDto> query = builder.createQuery(DettaglioTSDto.class);
		Root<DettaglioTS> root = query.from(DettaglioTS.class);
		/*
		 * Per un test abbiamo inserito un parametro di where con IDTimesheet uguale a 2
		 */
		query.where(builder.equal(root.get("timesheet"), idTime));
		query.select(builder.construct(DettaglioTSDto.class, root.get("id_dettaglio"), root.get("codiceCommessa"), root.get("task"),
				root.get("data_inizio"), root.get("data_fine"), root.get("ora_inizio"), root.get("ora_fine"),
				root.get("sede"), root.get("note")));
		TypedQuery<DettaglioTSDto> tq = em.createQuery(query);
		return tq.getResultList();
	}

}
