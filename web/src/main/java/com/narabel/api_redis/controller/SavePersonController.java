package com.narabel.api_redis.controller;

import com.narabel.api_redis.domain.Person;
import com.narabel.api_redis.domain.PersonId;
import com.narabel.api_redis.dto.PersonRequest;
import com.narabel.api_redis.service.SavePersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SavePersonController {

	@Autowired
	private SavePersonService savePersonService;

	@PostMapping("/person")
	void savePerson(@RequestBody PersonRequest personRequest) {
		this.savePersonService.savePerson(new Person(PersonId.generar(), personRequest.getName()));
	}
}
