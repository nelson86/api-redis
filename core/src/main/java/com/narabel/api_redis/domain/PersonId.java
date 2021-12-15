package com.narabel.api_redis.domain;

import lombok.Value;

import java.util.UUID;

@Value
public class PersonId {
	String value;

	public PersonId(String value) {
		this.value = value;
	}

	public static PersonId generar() {
		return new PersonId(UUID.randomUUID().toString());
	}
}
