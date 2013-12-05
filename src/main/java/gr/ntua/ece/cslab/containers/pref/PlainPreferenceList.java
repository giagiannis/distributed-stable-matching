package gr.ntua.ece.cslab.containers.pref;

/**
 * This class implements the {@link PreferenceList} interface, keeping all the data in memory.
 * @author Giannis Giannakopoulos
 *
 */
public class PlainPreferenceList implements PreferenceList {

	private Preference[] preferences;
	private int index;
	
	public PlainPreferenceList(Preference[] preferences) {
		this.preferences=preferences;
		this.index=-1;
	}
	
	@Override
	public Preference next() {
		if(!this.hasMore())
			return null; 
		this.index++;
		return this.preferences[this.index];
	}

	@Override
	public Preference getCurrentPreference() {
		if(!this.hasMore() || this.index<0)
			return null;
		return this.preferences[this.index];
	}

	@Override
	public boolean seek(int rank) {
		if(rank<1 || rank>this.preferences.length)
			return false;
		this.index=rank-1;
		return true;
	}

	@Override
	public boolean hasMore() {
		return this.index<this.preferences.length-1;
	}

	@Override
	public int length() {
		return this.preferences.length;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		for(Preference p:preferences){
			builder.append(p.toString()+" ");
		}
		return builder.toString();
	}
	
	public static void main(String[] args) {
		Preference[] prefs = new Preference[new Integer(args[0])];
		for(int i=1;i<args.length;i++){
			prefs[i-1]=new Preference(new Integer(args[i]), i);
		}
		PreferenceList list  = new PlainPreferenceList(prefs);
		System.out.println(list);
		while(list.hasMore()){
			System.out.print(list.next()+"\t");
		}
		System.out.println();
		System.out.println(list.seek(2));;
		System.out.println(list.getCurrentPreference());
		System.out.println(list.next());
		System.out.println(list.getCurrentPreference());
		while(list.hasMore()){
			System.out.print(list.next()+"\t");
		}
		System.out.println();
	}

}
