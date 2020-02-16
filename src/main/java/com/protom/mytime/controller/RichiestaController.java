package com.protom.mytime.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.protom.mytime.dto.RichiestaDto;
import com.protom.mytime.service.RichiestaService;

@RestController
@RequestMapping(value = "/api/richiesta")
public class RichiestaController {

	@Autowired
	RichiestaService service;

	@RequestMapping(value = "/findbyUser", method = RequestMethod.GET)
	public List<RichiestaDto> findRequestsbyUser(@RequestParam("username") String username) {
		return service.findRequestsbyUser(username);
	}
	
	@RequestMapping (value = "/findbyType", method = RequestMethod.GET)
	public List <RichiestaDto> findRequestsbyType (@RequestParam("id_tipologiarichiesta") int id_tipologiarichiesta){
		return service.findRequestsByTipe(id_tipologiarichiesta);
	}

}
