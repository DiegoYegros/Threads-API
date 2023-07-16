package com.threads.threadsapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThreadsApiApplication {
	private static final Logger logger = LoggerFactory.getLogger(ThreadsApiApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ThreadsApiApplication.class, args);
	}

}
