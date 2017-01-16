/**
 * Generic test class structure
 */
 
import org.junit.*;
import static org.junit.Assert.*;
import static java.lang.Math.random;


public class testHashUtilities extends junit.framework.TestCase{
    //whatever code you want to test
	//implement instance of class you want to test
	HashUtilities testClass1;
	
	/**
	 * Default contructor
	 */
	public testHashUtilities(){}
	
	/**
	 * Creates a (simple) test fixture
	 */
	public void setUp(){
	    testClass1 = new HashUtilities();
	}
	
	/**
	 * No resources to release
	 */
	protected void tearDown(){}
	
	@Test
	public void testshortHash(){
	    //assertion
		
		//set up loop to test 2000 numbers
		for(int i = 1; i <= 2000; i++){
			int randNum = (int)(random()*1000000);
			int returnedInt = testClass1.shortHash(randNum);
			boolean outcome = (returnedInt >=0 && returnedInt<1000);
			assertTrue(outcome);
		}
	}
	
	@Test
	public void testZero(){
		int test = 0;
		
		assertEquals(test,testClass1.shortHash(test));
		
	}
	
		@Test
	public void testUpperBoundaries(){
		
		for(int i =999;i <= 1000; i++){
			if(i==1000){
				assertEquals(0,testClass1.shortHash(i));
			}else{
				assertEquals(999,testClass1.shortHash(i));
			}
		}
		
		
	}
	

}