package com.protom.mytime.service;

import java.util.List;

import com.protom.mytime.dto.LogStatoDto;

public interface LogStatoService {
	public List<LogStatoDto> findLastStatus ();
	public LogStatoDto save (LogStatoDto logStato);
	public LogStatoDto update (LogStatoDto logStato);
	public List<LogStatoDto> findByStatus(Integer idStato);
	public List<LogStatoDto> findLogbyTimesheet (Integer id_timesheet);
}
