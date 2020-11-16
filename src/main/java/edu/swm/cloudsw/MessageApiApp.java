package edu.swm.cloudsw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

import springfox.documentation.swagger2.annotations.EnableSwagger2;





@SpringBootApplication
@EnableSwagger2
public class MessageApiApp extends SpringBootServletInitializer{
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MessageApiApp.class,args);
		
			
			
	}

}
