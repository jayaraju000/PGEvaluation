package com.sample.bootrestsample;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.bootrestsample"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class SpringBootRestApiApp {
 
    public static void main(String[] args) {
    	SpringApplication spapp = new SpringApplication(SpringBootRestApiApp.class);
    	spapp.run(args);
    	//SpringApplication.run(SpringBootRestApiApp.class, args);
        
    }
}
