package com.narabel.api_redis.repository;

import com.narabel.api_redis.domain.Person;

public interface DeletePersonRepository {

	void deletePerson(Person person);

}
