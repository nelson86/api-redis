package com.narabel.api_redis.controller;

import com.narabel.api_redis.service.ListPersonService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@Log4j2
@RestController
public class ListPersonController {

	@Autowired
	private ListPersonService listPersonService;

	@GetMapping("/people")
	public ResponseEntity getPeople() throws InterruptedException {
		log.info("Demora minima de 3 seg.");
		TimeUnit.SECONDS.sleep(3L);
		return ResponseEntity.ok(listPersonService.getListPerson());
	}

}
