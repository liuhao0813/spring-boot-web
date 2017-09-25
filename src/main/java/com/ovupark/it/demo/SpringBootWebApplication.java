package com.ovupark.it.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@MapperScan(basePackages="com.ovupark.it.**.dao")
@ComponentScan(basePackages= {"com.ovupark.it.**.service.impl","com.ovupark.it.**.controller"})
@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebApplication.class, args);
	}
	
	
        
	@Bean
    public SpringDataDialect springDataDialect() {
        return new SpringDataDialect();
    }
	
	@Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
