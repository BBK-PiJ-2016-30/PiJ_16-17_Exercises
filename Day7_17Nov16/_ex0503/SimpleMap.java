/**
* Map from integer to Strings: one to many
*/

public interface SimpleMap {
	/**
	* Puts a new String in the map.
	*/
	void put(int key, String name);
		/**
		* Returns all the name associated with that key,
		* or null if there is none.
		*/
	String get(int key);
		/**
		* Removes a name from the map.
		*/
	void remove(int key);
		/**
		* Returns true if there are no workers in the map,
		* false otherwise
		*/
	boolean isEmpty();
}