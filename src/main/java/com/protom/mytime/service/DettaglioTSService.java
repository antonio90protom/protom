package com.protom.mytime.service;

import java.util.Date;
import java.util.List;

import com.protom.mytime.dto.DettaglioTSDto;

public interface DettaglioTSService {
	public DettaglioTSDto save(DettaglioTSDto dettaglio);

	public DettaglioTSDto update(DettaglioTSDto dettaglio);

	public List<DettaglioTSDto> findByDate(Date data);

	public List<DettaglioTSDto> getDetailByTimesheet(Integer idTime);

}
