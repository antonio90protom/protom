package com.protom.mytime.dao;

import java.util.Date;
import java.util.List;

import com.protom.mytime.dto.RichiestaDto;

public interface RichiestaDao {
	public RichiestaDto save(RichiestaDto richiesta);

	public RichiestaDto update(RichiestaDto richiesta);

	public List<RichiestaDto> findRequestsbyUser(String username);

	public List<RichiestaDto> findRequestsByDate(Date dataScelta);
	
	public List<RichiestaDto> findRequestsbyType (int id_tipologiarichiesta);

}
