package com.harington.boond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class HaringtonBoondAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaringtonBoondAppApplication.class, args);
	}

}
