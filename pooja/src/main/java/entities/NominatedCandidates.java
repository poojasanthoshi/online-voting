package entities;
public class NominatedCandidates {
	private int candidateId;
	private String nominationFormNo;
	private int society_Voter;
	public NominatedCandidates() {
		super();
	}
	public NominatedCandidates(int candidateId, String nominationFormNo, int society_Voter) {
		super();
		this.candidateId = candidateId;
		this.nominationFormNo = nominationFormNo;
		this.society_Voter = society_Voter;
	}
	public int getCandidateId() {
		return candidateId;
	}
	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}
	public String getNominationFormNo() {
		return nominationFormNo;
	}
	public void setNominationFormNo(String nominationFormNo) {
		this.nominationFormNo = nominationFormNo;
	}
	public int getSociety_Voter() {
		return society_Voter;
	}
	public void setSociety_Voter(int society_Voter) {
		this.society_Voter = society_Voter;
	}
}
