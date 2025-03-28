package com.tkaEntity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long Id;
 @Column(unique = true)
 private String  UserName;
 @Column
 private String role;
 private String password ;
 
 
public User(Long id, String userName, String role, String password){
	super();
	UserName = userName;
	this.role = role;
	this.password =password;
}
public User(String userName2, String role2, String encryptedPassword) {

}
public String getPasswod() {
	return password;
}
public void setPasswod(String password) {
	this.password = password;
}
public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "User [Id=" + Id + ", UserName=" + UserName + ", role=" + role + ", passwod=" + password + "]";
}
  
 
 
 
}
