package service;

import java.util.List;

import repo.NominatedCandidate;

public interface NominatedCandidateService {
	NominatedCandidate addNominatedCandidateDao(int NominatedCandidates );
	NominatedCandidate updateUNominatedCandidateDao(int NominatedCandidates);
	int deleteNominatedCandidateDao(int candidateId);
	List<NominatedCandidate>viewNominatedCandidatesList();
	NominatedCandidate searchByCandidateId(int id);

}
