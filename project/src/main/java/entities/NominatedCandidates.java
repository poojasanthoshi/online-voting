package entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter	
public class NominatedCandidates {
	@Id

	private int candidateId;
	private String nominationFormNo;
	private int society_Voter;

}
