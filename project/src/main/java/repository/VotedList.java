package repository;

import java.util.List;

public interface VotedList {
	VotedList castVotedList(int VotedList);
	VotedList updateVotedListDetails(int VotedList);
	int deletedVotedListDetails(int id);
	List<VotedList>viewVotedList();
	VotedList searchByVoterId(int voterId);
	List<VotedList>searchByNominatedCandidateId(int candidateId);


}
