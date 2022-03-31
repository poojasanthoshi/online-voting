package service;

import java.util.List;

import entities.ElectionResult;
import entities.NominatedCandidates;
public interface ElectionResultService {
	ElectionResult addElectionResult(ElectionResult result);
	List<ElectionResult> viewElectionResultList();
	ElectionResult viewCandidateWiseResult(int candidateid);
	double viewVotingPercentage();
	double viewCandidateVotingPercent(int candidateid);
	void displayVotingStatistics();
	NominatedCandidates viewHighestVotingPercentCandidate();
	NominatedCandidates viewLowestVotingPercentCandidate();
	int viewInvalidVotes();
	List<NominatedCandidates> candidateWiseInvalidVotesList();
	void displayPollingResult();

}
