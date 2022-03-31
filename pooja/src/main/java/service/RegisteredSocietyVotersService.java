package service;

import java.util.List;

import entities.RegisteredSocietyVoters;

public interface RegisteredSocietyVotersService {
	RegisteredSocietyVoters voterRegistration(int RegisteredSocietyVoters);
	RegisteredSocietyVoters updateRegisteredVotersDetails(int RegisteredSocietyVoters);
	int deletedRegisteredVoter(int voterId);
	List<RegisteredSocietyVoters>viewRegisteredVoterList();
	RegisteredSocietyVoters searchByVoterId(int voterId);
	RegisteredSocietyVoters loginValidate(String userid,String password);

}
