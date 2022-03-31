package repository;

import java.util.List;


public interface NominatedCandidate {
	NominatedCandidate addNominatedCandidateDao(int NominatedCandidates );
	NominatedCandidate updateUNominatedCandidateDao(int NominatedCandidates);
	int deleteNominatedCandidateDao(int candidateId);
	List<NominatedCandidate>viewNominatedCandidatesList();
	NominatedCandidate searchByCandidateId(int id);

}
