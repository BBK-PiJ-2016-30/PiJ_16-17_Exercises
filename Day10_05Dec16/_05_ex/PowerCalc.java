/**
*interface for calculating power (base, exponent) iteratively and recursively
*/
public interface PowerCalc{
	
	/**
	*iterative calc for power
	*/
	public int iterPow(int val1, int val2);
	
	/**
	*recursively calc for power
	*/
	public int recurPow(int val1, int val2);
}