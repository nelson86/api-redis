package com.narabel.api_redis.adapter;

import com.narabel.api_redis.domain.Person;
import com.narabel.api_redis.domain.PersonId;
import com.narabel.api_redis.entity.PersonEntity;
import com.narabel.api_redis.repository.ListPersonRepository;
import com.narabel.api_redis.repository.PersonJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ListPersonAdapter implements ListPersonRepository {

	@Autowired
	private PersonJpaRepository personJpaRepository;

	@Override
	public List<Person> listPerson() {
		List<PersonEntity> personList = this.personJpaRepository.findAll();
		return personList.stream()
				.map(entity -> new Person(new PersonId(entity.getId()), entity.getName()))
				.collect(Collectors.toList());
	}

}
