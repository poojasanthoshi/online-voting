package entities;
public class VotedList {
	private int id;
	private int pollingDateTime;
	private String society;
	private int voter;
	private String candidate;
	public VotedList() {
		super();
	}
	public VotedList(int id, int pollingDateTime, String society, int voter, String candidate) {
		super();
		this.id = id;
		this.pollingDateTime = pollingDateTime;
		this.society = society;
		this.voter = voter;
		this.candidate = candidate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPollingDateTime() {
		return pollingDateTime;
	}
	public void setPollingDateTime(int pollingDateTime) {
		this.pollingDateTime = pollingDateTime;
	}
	public String getSociety() {
		return society;
	}
	public void setSociety(String society) {
		this.society = society;
	}
	public int getVoter() {
		return voter;
	}
	public void setVoter(int voter) {
		this.voter = voter;
	}
	public String getCandidate() {
		return candidate;
	}
	public void setCandidate(String candidate) {
		this.candidate = candidate;
	}
}
