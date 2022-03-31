package entities;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter	

public class VotedList {
	@Id
	private int id;
	private int pollingDateTime;
	private String society;
	private int voter;
	private String candidate;

}
