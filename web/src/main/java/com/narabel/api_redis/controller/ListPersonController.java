package com.narabel.api_redis.controller;

import com.narabel.api_redis.service.ListPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListPersonController {

	@Autowired
	private ListPersonService listPersonService;

	@GetMapping("/people")
	public ResponseEntity getPeople() {
		return ResponseEntity.ok(listPersonService.getListPerson());
	}

}
