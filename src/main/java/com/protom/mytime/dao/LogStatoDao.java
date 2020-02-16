package com.protom.mytime.dao;

import java.util.List;

import com.protom.mytime.dto.LogStatoDto;

public interface LogStatoDao {
	public List<LogStatoDto> findLastStatus();

	public LogStatoDto save(LogStatoDto logStato);

	public LogStatoDto update(LogStatoDto logStato);

	public List<LogStatoDto> findByStatus(Integer idStato);

	public List<LogStatoDto> findLogByTimesheet(Integer id_timesheet);

}
