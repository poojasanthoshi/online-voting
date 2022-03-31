package entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter	
public class ElectionResult {
	@Id
	private int id;
	private int pollingDate;
	private int candidate;
	private String coop_SocietyName;
	private int totalSocietyVotes;
	private int totalPolledVotes;
	private float totalPollingPercentage;
	private int totalCandidateVotes;
	private float candidateVotesPercentage;
	private String result;

}
