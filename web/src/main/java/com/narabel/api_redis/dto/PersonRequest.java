package com.narabel.api_redis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {

	//@NotEmpty(message = "Debe indicar el nombre del superheroe")
	String name;

}
