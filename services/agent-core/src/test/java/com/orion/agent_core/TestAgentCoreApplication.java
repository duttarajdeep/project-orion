package com.orion.agent_core;

import org.springframework.boot.SpringApplication;

public class TestAgentCoreApplication {

	public static void main(String[] args) {
		SpringApplication.from(AgentCoreApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
