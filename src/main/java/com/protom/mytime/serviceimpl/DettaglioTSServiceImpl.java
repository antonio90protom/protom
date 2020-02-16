package com.protom.mytime.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protom.mytime.dao.DettaglioTSDao;
import com.protom.mytime.dto.DettaglioTSDto;
import com.protom.mytime.service.DettaglioTSService;

@Service
public class DettaglioTSServiceImpl implements DettaglioTSService {

	@Autowired
	DettaglioTSDao dao;
	
	@Override
	public DettaglioTSDto save(DettaglioTSDto dettaglio) {
		// TODO Auto-generated method stub
		return dao.save(dettaglio);
	}

	@Override
	public DettaglioTSDto update(DettaglioTSDto dettaglio) {
		return dao.update(dettaglio);
	}

	@Override
	public List<DettaglioTSDto> findByDate(Date data) {
		return dao.findByDate(data);
	}

	@Override
	public List<DettaglioTSDto> getDetailByTimesheet(Integer idTime) {
		return dao.getDetailByTimesheet(idTime);
	}
	

}
