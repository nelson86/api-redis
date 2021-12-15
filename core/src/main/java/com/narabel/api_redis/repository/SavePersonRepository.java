package com.narabel.api_redis.repository;

import com.narabel.api_redis.domain.Person;

public interface SavePersonRepository {

	void savePerson(Person person);

}
