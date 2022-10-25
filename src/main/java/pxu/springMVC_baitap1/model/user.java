package pxu.springMVC_baitap1.model;

public class user {
	private String userName;
	private String passWord;
	private String role;

	public user() {
		super();
	}
	public user(String userName, String passWord, String role) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}
