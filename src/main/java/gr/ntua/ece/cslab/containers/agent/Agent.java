package gr.ntua.ece.cslab.containers.agent;

import gr.ntua.ece.cslab.containers.pref.PreferenceList;

public class Agent {
	
	private PreferenceList preferences;
	private int id;
	private AgentStatus status;
	private int partnerId=-1;
	
	public Agent() {
		this.setId(-1);
		this.setPreferences(null);
	}
	
	// getters and setters, nothing to look here ;)
	
	public PreferenceList getPreferences() {
		return preferences;
	}

	public int getId() {
		return id;
	}

	public AgentStatus getStatus() {
		return status;
	}

	public int getPartnerId() {
		return partnerId;
	}
	
	public void setPreferences(PreferenceList preferences) {
		this.preferences = preferences;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setStatus(AgentStatus status) {
		this.status = status;
	}

	public void setPartnerId(int partnerId) {
		this.partnerId = partnerId;
	}

	//	getters and setters stop
	
	public static void main(String[] args) {
		
	}

}
