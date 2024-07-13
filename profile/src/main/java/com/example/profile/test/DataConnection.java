package com.example.profile.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DataConnection {
	@Value("${database}")
	private String database;
	@Value("${dbname}")
	private String dbname;
	@Value("${password}")
	private String password;
	
	public void display() {
		/*System.out.println("Database = "+database);
		System.out.println("DB Name = "+dbname);
		System.out.println("Password = "+password);*/
		System.out.println("DATABASE IS= " +database+ "\nDBNAME IS= " +dbname+ " \nPASSWORD IS= " +password);
	}

}
