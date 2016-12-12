
public interface IntSet {
	
	/**
	*Adds new int to the set
	*if there already nothing happens
	*/
	public void add(int n);
	
	/**
	*returns true if number is in set
	*false otherwise
	*/
	public boolean contains(int n);
	
	/**
	*returns same as contains but prints elements checked on screen
	*/
	public boolean containsVerbose(int n);
	
	/**
	*returns a string with the values of elements
	*with the elements separated by commas
	*/
	public String toString();
	
}