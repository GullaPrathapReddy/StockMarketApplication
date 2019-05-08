package com.pt.sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.pt.sp.config.dto_config;
import com.pt.sp.config.service_config;

@SpringBootApplication
@Import(value= {dto_config.class,service_config.class})
public class BootStockMorketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootStockMorketApplication.class, args);
	}

}
