public class Launcher{

	public static void main(String [] args){
		
		SimpleMapImpl simpMap = new SimpleMapImpl();
		
		//check if map is empty
		System.out.println("Check if map contains elements...");
		if(simpMap.isEmpty()){
			System.out.println("Map is empty");
		}else{
			System.out.println("Map has at least one element");
		}
		
		String str = "";
		while(true){
			System.out.println("Enter a string to store in the map (press [q] to quit): ");
			str = System.console().readLine();
			if(str.equals("q")){
				break;
			}
			int smallHash = HashUtilities.shortHash(str.hashCode());
			simpMap.put(smallHash, str);
		}
		
		System.out.println("Check if map contains elements...");
		if(simpMap.isEmpty()){
			System.out.println("Map is empty");
		}else{
			System.out.println("Map has at least one element");
		}
		
		str = "";
		while(true){
			System.out.println("Enter a key to retrive the contents of this map location (press [q] to quit): ");
			str = System.console().readLine();
			if(str.equals("q")){
				break;
			}			
			int check = Integer.parseInt(str);
			System.out.println("Map key " + check + " contains " + simpMap.get(check));
		}
		
		System.out.println("Check if map contains elements...");
		if(simpMap.isEmpty()){
			System.out.println("Map is empty");
		}else{
			System.out.println("Map has at least one element");
		}
		
		str = "";
		while(true){
			System.out.println("Enter a key to remove contents from map (press [q] to quit): ");
			str = System.console().readLine();
			if(str.equals("q")){
				break;
			}			
			int reKey = Integer.parseInt(str);
			simpMap.remove(reKey);
		}
		
		System.out.println("Check if map contains elements...");
		if(simpMap.isEmpty()){
			System.out.println("Map is empty");
		}else{
			System.out.println("Map has at least one element");
		}

		
	}
}