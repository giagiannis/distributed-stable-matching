package gr.ntua.ece.cslab.containers.pref;

/**
 * Interface used to specify the communication interface for the preference list object.
 * @author Giannis Giannakopoulos
 *
 */
public interface PreferenceList {

	/**
	 * Returns the next preference (the head of the {@link PreferenceList} object moves
	 * to the next choice
	 * @return {@link Preference} element corresponding to the newly fetched preference
	 */
	public Preference next();
	
	/**
	 * Returns the current preference. This action does not move the pointer from the current element,
	 * but it just returns the head of the list.
	 * @return {@link Preference} element corresponding to the already fetched preference
	 */
	public Preference getCurrentPreference();
	
	/**
	 * This method is used to reposition the next element of the list. The parameter specifies the offset 
	 * pointing to the desired position in the list. The return value is true if the specified rank belongs to the 
	 * list (e.g. the offset is between 1 and list size), else false is returned. 
	 * @param rank 
	 * @return true if the method succeeded, else false
	 */
	public boolean seek(int rank);
	
	/**
	 * This method indicates whether the list contains more preferences to be fetched.
	 * @return true if more {@link Preference} elements exist, else false
	 */
	public boolean hasMore();
	
	/**
	 * Returns the length of the list
	 * @return an integer value corresponding to the length of the list
	 */
	public int length();
}
