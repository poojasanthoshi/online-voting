package entities;
public class ElectionOfficer {
	private int officerid;
	private String firstName;
	private String lastName;
	private String password;
	private String gender;
	private String mobileno;
	private String emailid;
	private String address1;
	private String address2;
	private String district;
	public ElectionOfficer() {
		super();
	}
	public ElectionOfficer(int officerid, String firstName, String lastName, String password, String gender,
			String mobileno, String emailid, String address1, String address2, String district) {
		super();
		this.officerid = officerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.gender = gender;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.address1 = address1;
		this.address2 = address2;
		this.district = district;
	}
	public int getOfficerid() {
		return officerid;
	}
	public void setOfficerid(int officerid) {
		this.officerid = officerid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

}
