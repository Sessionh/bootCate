package com.winter;

import org.mybatis.spring.annotation.MapperScan;
		import org.springframework.boot.SpringApplication;
		import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.winter.dao")
public class SpringRuns {

	public static void main(String[] args) {
		SpringApplication.run(SpringRuns.class, args);
	}
}
