public class Launcher{
	public static void main(String [] args){
		LinkedList newList = new LinkedList();
		
		int [] ArrInt = {1,2,3,4,10,2,8,9,10,12,35,1,3};
		
		newList = ArrayUtilities.intArrToList(ArrInt);
		
		newList.printList();

	}
}