package com.protom.mytime.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.protom.mytime.dao.TimesheetDao;
import com.protom.mytime.dto.TimesheetDto;
import com.protom.mytime.service.TimesheetService;

@Service
public class TimesheetServiceImpl implements TimesheetService {

	@Autowired
	TimesheetDao dao;

	@Override
	public List<TimesheetDto> findTimesheetbyUser(String username) {
		return dao.findTimesheetbyUser(username);
	}

	@Override
	public List<TimesheetDto> findByApprovatore(String username_approvatore) {
		return dao.findByApprovatore(username_approvatore);
	}

	@Override
	public TimesheetDto save(TimesheetDto timesheet) {
		return dao.save(timesheet);
	}

	@Override
	public TimesheetDto update(TimesheetDto timesheet) {
		return dao.update(timesheet);
	}

}
