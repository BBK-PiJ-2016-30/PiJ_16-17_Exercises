/**
 * Generic test class structure
 */
 
import org.junit.*;
import static org.junit.Assert.*;
import static java.lang.Math.random;


public class testPerson extends junit.framework.TestCase{
    //whatever code you want to test
	//implement instance of class you want to test
	Person p;
	
	/**
	 * Default contructor
	 */
	public testPerson(){}
	
	/**
	 * Creates a (simple) test fixture
	 */
	public void setUp(){
	    p = new Person();
	}
	
	/**
	 * No resources to release
	 */
	protected void tearDown(){}
	
  @Test
  public void testsNormalName() {
    String output = p.getInitials("Jo Robert John");
    assertEquals("JRJ", output);
  }

  @Test
  public void testsOneExtraSpaceMiddleName() {
    String output = p.getInitials("Jo  Robert John");
    assertEquals("JRJ", output);
  }

  @Test
  public void testsManyExtraSpaceMiddleName() {
    String output = p.getInitials("Jo Robert   John");
    assertEquals("JRJ", output);
  }

  @Test
  public void testsExtraSpaceAtFrontName() {
    String output = p.getInitials("     Jo Robert John");
    assertEquals("JRJ", output);
  }
	

}