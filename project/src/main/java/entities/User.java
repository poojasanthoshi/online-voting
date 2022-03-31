package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter	
public class User {
	@Id
		private int userId;
		private String password;
		private String lastName;
		private String mobileno;
		private String emailid;
		

}
