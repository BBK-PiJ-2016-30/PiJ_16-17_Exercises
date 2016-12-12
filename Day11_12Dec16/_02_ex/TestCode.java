public class TestCode{
	public static void main(String [] args){
		TestCode newTest = new TestCode();
		
		newTest.launch();
	}
	
	public void launch(){
		IntSet testT = new TreeIntSet(6);
		
		testT.add(5);
		testT.add(9);
		testT.add(3);
		testT.add(8);
		testT.add(11);
		testT.add(12);
		
		System.out.println(testT.contains(2));
		System.out.println(testT.contains(12));
		
		System.out.println(testT.containsVerbose(2));
		System.out.println(testT.containsVerbose(12));
		
		System.out.println(testT.toString());
	}

}