package com.protom.mytime.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protom.mytime.dao.LogStatoDao;
import com.protom.mytime.dto.LogStatoDto;
import com.protom.mytime.service.LogStatoService;

@Service
public class LogStatoServiceImpl implements LogStatoService {

	@Autowired
	LogStatoDao dao;

	@Override
	public List<LogStatoDto> findLastStatus() {
		return dao.findLastStatus();
	}

	@Override
	public LogStatoDto save(LogStatoDto logStato) {
		return dao.save(logStato);
	}

	@Override
	public LogStatoDto update(LogStatoDto logStato) {
		return dao.update(logStato);
	}

	@Override
	public List<LogStatoDto> findByStatus(Integer id_stato) {
		return dao.findByStatus(id_stato);
	}

	@Override
	public List<LogStatoDto> findLogbyTimesheet(Integer id_timesheet) {
		return dao.findLogByTimesheet(id_timesheet);
	}

}
