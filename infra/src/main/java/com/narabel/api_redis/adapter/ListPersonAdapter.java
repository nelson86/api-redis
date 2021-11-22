package com.narabel.api_redis.adapter;

import com.narabel.api_redis.repository.ListPersonRepository;
import org.springframework.stereotype.Component;

@Component
public class ListPersonAdapter implements ListPersonRepository {

	@Override
	public String listPerson() {
		return "Retornando 200 peronas";
	}

}
