package com.example.querytimeoutbug;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "test_table")
public class TestEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "BIGINT", nullable = false, updatable = false, unique = true, insertable = false)
	private Long id;

	@Column(name = "description", length = 45, nullable = false)
	private String description;

	TestEntity() {
	}

	public TestEntity(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return this.description;
	}

}
