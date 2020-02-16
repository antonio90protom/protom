package com.protom.mytime.serviceimpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protom.mytime.dao.RichiestaDao;
import com.protom.mytime.dto.RichiestaDto;
import com.protom.mytime.service.RichiestaService;

@Service
public class RichiestaServiceImpl implements RichiestaService {

	@Autowired
	RichiestaDao dao;

	@Override
	public RichiestaDto save(RichiestaDto richiesta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RichiestaDto update(RichiestaDto richiesta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RichiestaDto> findRequestsbyUser(String username) {
		return dao.findRequestsbyUser(username);
	}

	@Override
	public List<RichiestaDto> findRequestsByDate(Date dataScelta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RichiestaDto> findRequestsByTipe(int id_tipologiarichiesta) {
		// TODO Auto-generated method stub
		return dao.findRequestsbyType(id_tipologiarichiesta);
	}

}
