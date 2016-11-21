public class Launcher{
	public static void main(String [] args){
		LinkedList newList = new LinkedList();
		ListPoint newPoint = null;

		for(int i = 0; i <=15; i ++){
			newPoint = new ListPoint(1 + (int)(Math.random()*10));
			newList.insertPoint(newPoint);
			//System.out.println("List: " + i);
			//newList.printList();
		}
		
		newList.printList();

	}
}