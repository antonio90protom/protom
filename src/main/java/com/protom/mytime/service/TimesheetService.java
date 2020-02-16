package com.protom.mytime.service;

import java.util.List;

import com.protom.mytime.dto.TimesheetDto;

public interface TimesheetService {
	public List<TimesheetDto> findTimesheetbyUser(String username);

	public List<TimesheetDto> findByApprovatore(String username_approvatore);
	
	public TimesheetDto save (TimesheetDto timesheet);
	
	public TimesheetDto update (TimesheetDto timesheet);

}
