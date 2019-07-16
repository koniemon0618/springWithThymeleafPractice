package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppApplication.class, args);
	}

}

//database sample...
//
//CREATE DATABASE db_sample_1 CHARACTER SET UTF8;
//use db_sample_1;
//create user 'springuser'@'%' identified by 'ThePassword';
//grant all on db_sample_1.* to 'springuser'@'%';
//CREATE TABLE user (
//  id int primary key AUTO_INCREMENT,
//  name varchar(254)
//);
//INSERT INTO user (id, name) VALUES (1, "nanashi");