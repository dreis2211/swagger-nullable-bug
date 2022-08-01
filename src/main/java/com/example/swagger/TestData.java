package com.example.swagger;

import io.swagger.v3.oas.annotations.media.Schema;

public class TestData {

	@Schema(nullable = true, example = "null")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
