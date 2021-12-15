package com.narabel.api_redis.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {
	PersonId id;
	String name;
}
