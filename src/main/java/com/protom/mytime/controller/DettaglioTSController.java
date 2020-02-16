package com.protom.mytime.controller;

import java.util.Date;
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

import com.protom.mytime.dto.DettaglioTSDto;
import com.protom.mytime.service.DettaglioTSService;

@RestController
@RequestMapping(value = "/api/dettaglio")
public class DettaglioTSController {

	@Autowired
	DettaglioTSService service;

	@RequestMapping(value = "/detts", method = RequestMethod.GET)
	public ResponseEntity<List<DettaglioTSDto>> getDetailByTimesheet(@RequestParam("idTime") Integer idTime) {
		return new ResponseEntity<List<DettaglioTSDto>>(service.getDetailByTimesheet(idTime), HttpStatus.OK);
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public DettaglioTSDto save(@RequestBody DettaglioTSDto dettaglio) {
		return service.save(dettaglio);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
	public DettaglioTSDto update(@PathVariable("id") Integer id, @RequestBody DettaglioTSDto dettaglio) {
		dettaglio.setId_dettaglio(id);
		return service.update(dettaglio);
	}

	@RequestMapping(value = "/date", method = RequestMethod.GET) /*
																	 * Tramite l'annotation RequestParam preleviamo dati
																	 * dalla scheda params di Postman (ci consentirà di
																	 * di prelevare dati da un altro servizio)
																	 */
	public ResponseEntity<List<DettaglioTSDto>> findByDate(@RequestParam("data") Date data) {
		return new ResponseEntity<List<DettaglioTSDto>>(service.findByDate(data), HttpStatus.OK);
	}

}