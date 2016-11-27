public class SimpleMapImpl implements SimpleMap{
	
	
	private String [] hashMap;
	
	public SimplMapImpl(int arrSize){
		hashMap = new String[arrSize]
	}
	
	/**
	* Puts a new String in the map.
	*/
	public void put(int key, String name){
		if(get(key)==null){
			hashMap[key] = name;
			System.out.println(name + " stored in map under this key " + key);
			return;
		}
		System.out.println(key + " is already in the map");
		return;
	}
		/**
		* Returns all the name associated with that key,
		* or null if there is none.
		*/
	public String get(int key){
		return(hashMap[key]);		
	}
	
		/**
		* Removes a name from the map.
		*/
	public void remove(int key){
		if(get(key) != null){
			System.out.println("Removing " + get(key) + " from map");
			hashMap[key] = null;
			return;
		}
		System.out.println("Key " + key + " not in map");
		return;
	}
	
		/**
		* Returns true if there are no workers in the map,
		* false otherwise
		*/
	public boolean isEmpty(){
		for(int i = 0; i < hashMap.length; i++){
			if(hashMap[i]!=null){
				return(false);
			}
		}
		return(true);
	}

}