package com.orion.schema_generator;

import org.springframework.boot.SpringApplication;

public class TestSchemaGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.from(SchemaGeneratorApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
