package entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter	

public class CooperativeSociety {
	@Id
	private int societyId;
	private String societyName;
	private String headOfSociety;
	private String village;
	private String mandal;
	private String district;
	private String pincode;

}
