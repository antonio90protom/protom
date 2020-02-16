package com.protom.mytime.controller;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 
import com.protom.mytime.dto.LogStatoDto;
import com.protom.mytime.service.LogStatoService;

@RestController
@RequestMapping (value="/api/log")
public class LogStatoController {
	
	@Autowired
	LogStatoService service;

	@RequestMapping (value = "/laststatus", method = RequestMethod.GET)
	public ResponseEntity<List<LogStatoDto>> findLastStatus() {
		return new ResponseEntity<List<LogStatoDto>>(service.findLastStatus(), HttpStatus.OK);
	}
	
	@RequestMapping (value ="/save", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public LogStatoDto save (@RequestBody LogStatoDto lsDto) {
		return service.save(lsDto);}

	@RequestMapping (value ="/update/{id}", method = RequestMethod.PUT)
	public LogStatoDto update (@PathVariable("id") Integer id, @RequestBody LogStatoDto lsDto) {
	lsDto.setId_logstato(id);
	return service.update(lsDto);}


	@RequestMapping (value ="/stato", method = RequestMethod.GET)
	public List<LogStatoDto> findByStatus(@RequestParam("id_stato") Integer idStato) {
	return service.findByStatus(idStato);
	}
	
	@RequestMapping (value="/logbyts", method = RequestMethod.GET)
	public List<LogStatoDto> findLogByTimesheet (@RequestParam("id_timesheet") Integer id_timesheet) {
		return service.findLogbyTimesheet(id_timesheet);
	}
	}

