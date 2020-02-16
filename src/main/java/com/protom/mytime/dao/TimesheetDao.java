package com.protom.mytime.dao;

import java.util.List;

import com.protom.mytime.dto.TimesheetDto;

public interface TimesheetDao {
	
	public List<TimesheetDto> findTimesheetbyUser(String username);

	public List<TimesheetDto> findByApprovatore(String user_approvatore);
	
	public TimesheetDto save (TimesheetDto timesheet);
	
	public TimesheetDto update (TimesheetDto timesheet);
	
	public TimesheetDto delete ();

}
