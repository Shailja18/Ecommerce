package com.luv2code.spring_boot_ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *@ComponentScan({"com.cognizant.pmo"})
 */
@SpringBootApplication
@ComponentScan({"com.luv2code.spring_boot_ecommerce"})
@EnableAutoConfiguration
public class App 
{
    public static void main( String[] args )
    {
    	
        SpringApplication.run(App.class, args);
    }
}