package com.example.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.profile.test.DataConnection;

@SpringBootApplication
public class ProfileApplication {

	public static void main(String[] args) {
		   ApplicationContext applicationcontext=SpringApplication.run(ProfileApplication.class, args);
		   DataConnection dataconnection=applicationcontext.getBean("dataConnection",DataConnection.class);
		   dataconnection.display();
		   
	}

}
