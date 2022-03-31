package service;

import java.util.List;

import entities.VotedList;

public interface VotedListService {
	VotedList castVotedList(int VotedList);
	VotedList updateVotedListDetails(int VotedList);
	int deletedVotedListDetails(int id);
	List<VotedList>viewVotedList();
	VotedList searchByVoterId(int voterId);
	List<VotedList>searchByNominatedCandidateId(int candidateId);


}
