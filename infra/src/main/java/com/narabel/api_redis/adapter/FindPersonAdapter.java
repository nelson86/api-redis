package com.narabel.api_redis.adapter;

import com.narabel.api_redis.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.PostConstruct;

public class FindPersonAdapter {
	/*
	private static final String KEY = "Person";

	@Autowired
	private RedisTemplate<String, Person> redisTemplate;
	private HashOperations hashOperations;

	@PostConstruct
	private void init() {
		this.hashOperations = redisTemplate.opsForHash();
	}
*/
}
