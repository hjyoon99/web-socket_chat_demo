package com.example.web.socketdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class WebSocketDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSocketDemoApplication.class, args);
	}

}
