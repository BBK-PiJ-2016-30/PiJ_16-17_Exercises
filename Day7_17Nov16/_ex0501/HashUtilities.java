public class HashUtilities{
	
	/**
	*takes an integer
	*returns an integer between 0 and 1000
	*/
	public static int shortHash(int x){
		return(Math.abs(x%1000));
	}
}