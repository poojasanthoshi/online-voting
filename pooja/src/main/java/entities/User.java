package entities;
public class User {
	private int userId;
	private String password;
	private String lastName;
	private String mobileno;
	private String emailid;
	public User() {
		super();
	}
	public User(int userId, String password, String lastName, String mobileno, String emailid) {
		super();
		this.userId = userId;
		this.password = password;
		this.lastName = lastName;
		this.mobileno = mobileno;
		this.emailid = emailid;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	

}
