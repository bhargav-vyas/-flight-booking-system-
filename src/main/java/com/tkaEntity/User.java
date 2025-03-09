package com.tkaEntity;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
@Entity
public class User {

	@Id
 private Long Id;
 
 private String  UserName;
 
 
}
