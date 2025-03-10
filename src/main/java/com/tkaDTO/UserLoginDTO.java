package com.tkaDTO;

public class UserLoginDTO {

	private String email;
	private String Password; 
	
	public UserLoginDTO() {
		// TODO Auto-generated constructor stub
	}

	public UserLoginDTO(String email, String password) {
		super();
		this.email = email;
		Password = password;
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
		return "UserLoginDTO [email=" + email + ", Password=" + Password + "]";
	}
	
}
