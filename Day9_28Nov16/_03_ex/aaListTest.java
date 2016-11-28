public class aaListTest{
	public static void main(String [] args){
		aaListTest test = new aaListTest();
		test.launcher();
	
	}
	
	public void launcher(){
		Company newComp = new Company();
		
		//add employee names
		for(int i=0; i<10; i++){
			newComp.nameList.addNode("Employee_"+i);
		}
		//add employee numbers
		for(int i=0; i<10; i++){
			newComp.NINList.addNode(i);
		}
		newComp.nameList.deleteNode("Employee_1");
		newComp.NINList.deleteNode(5);
		
		System.out.println("\nEmployee list to be printed");
		newComp.nameList.printList();
		System.out.println("\nEmployee list to be printed");
		newComp.NINList.printList();
	
	}

}