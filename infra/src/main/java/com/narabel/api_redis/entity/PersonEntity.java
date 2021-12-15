package com.narabel.api_redis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "person")
public class PersonEntity {

	@Id
	@Column(length = 36)
	private String id;

	private String name;

}
