package com.narabel.api_redis.adapter;

import com.narabel.api_redis.domain.Person;
import com.narabel.api_redis.entity.PersonEntity;
import com.narabel.api_redis.repository.PersonJpaRepository;
import com.narabel.api_redis.repository.SavePersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SavePersonAdapter implements SavePersonRepository {

	@Autowired
	private PersonJpaRepository personJpaRepository;

	@Override
	public void savePerson(Person person) {
		PersonEntity entity = new PersonEntity(person.getId().getValue(), person.getName());
		this.personJpaRepository.save(entity);
	}
}
