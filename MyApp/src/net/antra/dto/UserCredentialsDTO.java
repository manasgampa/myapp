package net.antra.dto;

public class UserCredentialsDTO {

	String uName;
	String password;
	
	public UserCredentialsDTO(String uName,String password) {
		this.uName=uName;
		this.password=password;		
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
