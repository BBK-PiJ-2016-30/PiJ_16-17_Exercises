public class ITN_Test{
	public static void main(String [] args){
		ITN_Test test = new ITN_Test();
		
		test.launch();
	}
	
	public void launch(){
		IntegerTreeNode testTree = new IntegerTreeNode(6);
		
		testTree.add(5);
		testTree.add(10);
		testTree.add(2);
		testTree.add(1);
		testTree.add(5);
		testTree.add(7);
		testTree.add(9);
		
		System.out.println("Contains 1 - " + testTree.contains(1));
		System.out.println("Contains 20 - " + testTree.contains(20));
		
		System.out.println(testTree.getMax());
		
		System.out.println(testTree.getMin());
		
	
	}

}