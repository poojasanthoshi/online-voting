package repo;

import java.util.List;

public interface RegisteredSocietyVoters {
	RegisteredSocietyVoters voterRegistration(int RegisteredSocietyVoters);
	RegisteredSocietyVoters updateRegisteredVotersDetails(int RegisteredSocietyVoters);
	int deletedRegisteredVoter(int voterId);
	List<RegisteredSocietyVoters>viewRegisteredVoterList();
	RegisteredSocietyVoters searchByVoterId(int voterId);
	RegisteredSocietyVoters loginValidate(String userid,String password);
}
