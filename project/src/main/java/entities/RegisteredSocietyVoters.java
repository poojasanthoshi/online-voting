package entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter	
public class RegisteredSocietyVoters {
	@Id
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

}
