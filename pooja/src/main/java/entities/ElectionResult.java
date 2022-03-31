package entities;
public class ElectionResult {
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
	public ElectionResult() {
		super();
	}
	public ElectionResult(int id, int pollingDate, int candidate, String coop_SocietyName, int totalSocietyVotes,
			int totalPolledVotes, float totalPollingPercentage, int totalCandidateVotes, float candidateVotesPercentage,
			String result) {
		super();
		this.id = id;
		this.pollingDate = pollingDate;
		this.candidate = candidate;
		this.coop_SocietyName = coop_SocietyName;
		this.totalSocietyVotes = totalSocietyVotes;
		this.totalPolledVotes = totalPolledVotes;
		this.totalPollingPercentage = totalPollingPercentage;
		this.totalCandidateVotes = totalCandidateVotes;
		this.candidateVotesPercentage = candidateVotesPercentage;
		this.result = result;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPollingDate() {
		return pollingDate;
	}
	public void setPollingDate(int pollingDate) {
		this.pollingDate = pollingDate;
	}
	public int getCandidate() {
		return candidate;
	}
	public void setCandidate(int candidate) {
		this.candidate = candidate;
	}
	public String getCoop_SocietyName() {
		return coop_SocietyName;
	}
	public void setCoop_SocietyName(String coop_SocietyName) {
		this.coop_SocietyName = coop_SocietyName;
	}
	public int getTotalSocietyVotes() {
		return totalSocietyVotes;
	}
	public void setTotalSocietyVotes(int totalSocietyVotes) {
		this.totalSocietyVotes = totalSocietyVotes;
	}
	public int getTotalPolledVotes() {
		return totalPolledVotes;
	}
	public void setTotalPolledVotes(int totalPolledVotes) {
		this.totalPolledVotes = totalPolledVotes;
	}
	public float getTotalPollingPercentage() {
		return totalPollingPercentage;
	}
	public void setTotalPollingPercentage(float totalPollingPercentage) {
		this.totalPollingPercentage = totalPollingPercentage;
	}
	public int getTotalCandidateVotes() {
		return totalCandidateVotes;
	}
	public void setTotalCandidateVotes(int totalCandidateVotes) {
		this.totalCandidateVotes = totalCandidateVotes;
	}
	public float getCandidateVotesPercentage() {
		return candidateVotesPercentage;
	}
	public void setCandidateVotesPercentage(float candidateVotesPercentage) {
		this.candidateVotesPercentage = candidateVotesPercentage;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
