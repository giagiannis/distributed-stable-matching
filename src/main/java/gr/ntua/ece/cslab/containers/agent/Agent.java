package gr.ntua.ece.cslab.containers.agent;

import gr.ntua.ece.cslab.containers.pref.PreferenceList;

public class Agent {
	
	private PreferenceList preferences;
	private int id;
	
	public Agent() {
		this.setId(-1);
		this.setPreferences(null);
	}
	
	public PreferenceList getPreferences() {
		return preferences;
	}

	public int getId() {
		return id;
	}

	public void setPreferences(PreferenceList preferences) {
		this.preferences = preferences;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		
	}

}
