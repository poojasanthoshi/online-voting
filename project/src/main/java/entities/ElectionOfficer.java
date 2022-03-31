package entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter	
public class ElectionOfficer {
	@Id
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

}
