public class Launcher{

	public static void main(String [] args){
		
		SimpleMap simpMap = new SimpleMapImpl();
		
		//check if map is empty
		System.out.println("Check if map contains elements...");
		if(simpMap.isEmpty()){
			System.out.println("Map is empty");
		}else{
			System.out.println("Map has at least one element");
		}
		
		
		//add in switcher
		String str = "";
		String option = "";
		
		boolean exit = false;
		while(!exit){
			System.out.println("Please make a choice:");
			System.out.println("[1] to add entry to map");
			System.out.println("[2] to get value of key in map");
			System.out.println("[3] to remove an entry from the map");
			System.out.println("[0] to exit");
			System.out.print("Please make a choice: ");
			option = System.console().readLine();
			int outCheck = Integer.parseInt(option);
		
			switch(outCheck){
				case 0:				
					exit = true;
					break;
				case 1:
					System.out.print("Enter a string to store in the map: ");
					str = System.console().readLine();
					int smallHash = HashUtilities.shortHash(str.hashCode());
					simpMap.put(smallHash, str);	
					break;
				case 2:
					System.out.print("Enter a key to retrieve the contents of this map location: ");
					str = System.console().readLine();	
					int check = Integer.parseInt(str);
					System.out.println("Map key " + check + " contains " + simpMap.get(check));				
					break;
				case 3:
					System.out.print("Enter a key to remove contents from map: ");
					str = System.console().readLine();	
					int reKey = Integer.parseInt(str);
					simpMap.remove(reKey);				
					break;
				default:
					System.out.println("Please enter a valid option");
					break;
			}
		}
		
		System.out.println("Check if map contains elements...");
		if(simpMap.isEmpty()){
			System.out.println("Map is empty");
		}else{
			System.out.println("Map has at least one element");
		}

		
	}
}