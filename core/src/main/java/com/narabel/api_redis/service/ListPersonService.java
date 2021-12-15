package com.narabel.api_redis.service;

import com.narabel.api_redis.commons.annotation.Service;
import com.narabel.api_redis.domain.Person;
import com.narabel.api_redis.repository.ListPersonRepository;

import java.util.List;


@Service
public class ListPersonService {

	private final ListPersonRepository repository;

	public ListPersonService(ListPersonRepository repository) {
		this.repository = repository;
	}


	public List<Person> getListPerson() {
		return this.repository.listPerson();
	}

}
