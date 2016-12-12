public class ITN_Test{
	public static void main(String [] args){
		ITN_Test test = new ITN_Test();
		
		test.launch();
	}
	
	public void launch(){
		IntegerTreeNode testTree = new IntegerTreeNode(6);
		
		testTree.add(5);
		testTree.add(9);
		testTree.add(3);
		testTree.add(8);
		testTree.add(11);
		testTree.add(12);

		System.out.println("Contains 5 - " + testTree.contains(5));
		System.out.println("Contains 20 - " + testTree.contains(20));
		
		System.out.println(testTree.getMax());
		
		System.out.println(testTree.getMin());
		
		System.out.println(testTree.toString());
		
		System.out.println(testTree.toStringSimple());
		
	
	}

}