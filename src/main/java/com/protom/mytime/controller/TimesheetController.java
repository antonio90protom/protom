package com.protom.mytime.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.protom.mytime.dto.LogStatoDto;
import com.protom.mytime.dto.TimesheetDto;
import com.protom.mytime.service.TimesheetService;

@RestController
@RequestMapping(value = "/api/timesheet")
public class TimesheetController {

	@Autowired
	TimesheetService service;

	@RequestMapping(value = "/byUser", method = RequestMethod.GET)
	public ResponseEntity<List<TimesheetDto>> findTimesheetbyUser(@RequestParam("username") String username) {
		return new ResponseEntity<List<TimesheetDto>>(service.findTimesheetbyUser(username), HttpStatus.OK);
	}

	@RequestMapping(value = "/approvatore/{username_approvatore}", method = RequestMethod.GET)
	public List<TimesheetDto> findByApprovatore(
			@PathVariable(name = "username_approvatore") String username_approvatore) {
		return service.findByApprovatore(username_approvatore);
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public TimesheetDto save(@RequestBody TimesheetDto timesheet) {
		return service.save(timesheet);
	}
	
	@RequestMapping (value = "/update", method = RequestMethod.PUT)
	public TimesheetDto update (@PathVariable("id") Integer id, @RequestBody TimesheetDto timesheet) {
		timesheet.setId_timesheet(id);
		return service.update(timesheet);}
}
