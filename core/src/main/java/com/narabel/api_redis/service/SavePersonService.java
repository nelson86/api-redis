package com.narabel.api_redis.service;

import com.narabel.api_redis.commons.annotation.Service;
import com.narabel.api_redis.domain.Person;
import com.narabel.api_redis.repository.SavePersonRepository;

@Service
public class SavePersonService {

	private final SavePersonRepository repository;

	public SavePersonService(SavePersonRepository repository) {
		this.repository = repository;
	}

	public void savePerson(Person person) {
		this.repository.savePerson(person);
	}
}
