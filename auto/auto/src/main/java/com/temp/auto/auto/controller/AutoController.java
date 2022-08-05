package com.temp.auto.auto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.temp.auto.auto.dto.AutoResponse;
import com.temp.auto.auto.dto.CarModelDto;
import com.temp.auto.auto.dto.CarModelEntity;
import com.temp.auto.auto.service.AutoInventoryService;


@RestController
@RequestMapping(value = "/auto")

public class AutoController {
	
	@Autowired
	AutoInventoryService service;
	
	
	@PostMapping(value="/add-auto")
	public ResponseEntity<AutoResponse> getOrAddAuto(@RequestBody CarModelDto request) {
		AutoResponse resp = new AutoResponse();
		 resp = service.processAutoInventory(request);
		
		return new ResponseEntity<AutoResponse>(resp, HttpStatus.OK);
	}
	
	@GetMapping(value="/get-auto-details/{id}")
	public ResponseEntity<AutoResponse>  getCarModelDetails(@PathVariable Long id) {
		
		AutoResponse resp = new AutoResponse();
		 resp = service.inquireAutoInventory(id);
		
		return new ResponseEntity<AutoResponse>(resp, HttpStatus.OK);
		
	}
	


}
