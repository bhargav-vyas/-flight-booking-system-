package com.tkaDTO;

public class UserLoginDTO {

	private String email;
	private String Password; 
	private String userName;
	public UserLoginDTO() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserLoginDTO(String email, String password, String userName) {
		super();
		this.email = email;
		Password = password;
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "UserLoginDTO [email=" + email + ", Password=" + Password + ", userName=" + userName + "]";
	}
	
}
