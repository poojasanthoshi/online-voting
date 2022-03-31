package entities;
public class RegisteredSocietyVoters {
	
	private int id;
	private String voteridCardNo;
	private String firstName;
	private String lastName;
	private String gender;
	private String password;
	private String reservationCategory;
	private String mobileno;
	private String emailid;
	private String address1;
	private String address2;
	private String mandal;
	private String district;
	private int pincode;
	private String society;
	private boolean castedVote;
	public RegisteredSocietyVoters() {
		super();
	}
	public RegisteredSocietyVoters(int id, String voteridCardNo, String firstName, String lastName, String gender,
			String password, String reservationCategory, String mobileno, String emailid, String address1,
			String address2, String mandal, String district, int pincode, String society, boolean castedVote) {
		super();
		this.id = id;
		this.voteridCardNo = voteridCardNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.password = password;
		this.reservationCategory = reservationCategory;
		this.mobileno = mobileno;
		this.emailid = emailid;
		this.address1 = address1;
		this.address2 = address2;
		this.mandal = mandal;
		this.district = district;
		this.pincode = pincode;
		this.society = society;
		this.castedVote = castedVote;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVoteridCardNo() {
		return voteridCardNo;
	}
	public void setVoteridCardNo(String voteridCardNo) {
		this.voteridCardNo = voteridCardNo;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReservationCategory() {
		return reservationCategory;
	}
	public void setReservationCategory(String reservationCategory) {
		this.reservationCategory = reservationCategory;
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
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	public boolean isCastedVote() {
		return castedVote;
	}
	public void setCastedVote(boolean castedVote) {
		this.castedVote = castedVote;
	}
	
}
