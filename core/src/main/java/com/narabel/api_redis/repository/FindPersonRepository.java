package com.narabel.api_redis.repository;

import com.narabel.api_redis.domain.Person;
import com.narabel.api_redis.domain.PersonId;

public interface FindPersonRepository {

	Person findById( PersonId id );

}
