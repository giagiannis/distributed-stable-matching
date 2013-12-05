package gr.ntua.ece.cslab.containers;

/**
 * Data container used to hold information about a specific 
 * preference. The memory consumption of such an element is twice the size
 * of an integer number (the index and the actual preference id is held). 
 * @author Giannis Giannakopoulos
 *
 */
public class Preference {

	private int preferenceId;
	private int preferenceRank;
	
	public Preference() {
		
	}
	public Preference(int preferenceId, int preferenceRank) {
		this.setPreferenceId(preferenceId);
		this.setPreferenceRank(preferenceRank);
	}

	public void setPreferenceRank(int preferenceRank) {
		this.preferenceRank=preferenceRank;
		
	}

	public void setPreferenceId(int preferenceId) {
		this.preferenceId=preferenceId;
	}	
	
	public int getPreferenceId() {
		return preferenceId;
	}
	
	public int getPreferenceRank() {
		return preferenceRank;
	}
	
	@Override
	public String toString() {
		return this.preferenceId+"("+this.preferenceRank+")";
	}
}
