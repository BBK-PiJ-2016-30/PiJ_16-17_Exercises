/**
 * class from notes for day 12
 *
 * @author BBK-PiJ-2016-30
 */
 
public class Person{

	/**
	 * default contructor
	 */
	public Person(){}
	
	
	//lecturers code
	
	public String getInitials(String fullName) {
    String result = "";
    String[] words = fullName.split("\\s+");
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() != 0) {
        String nextInitial = "" + words[i].charAt(0);
        result = result + nextInitial.toUpperCase();
      }
    }
    return result;
	}
	
	/**
	 * Method from notes to get the intial of a 
	 * persons full name
	 *
	 * @param fullName String
	 * @return String result
	 */
	// public String getInitials(String fullName){
		// String result = "";
		// String[] words = fullName.split(" ");
		
		// for(int i = 0; i < words.length; i++){
			// String nextInitial = "" + words[i].charAt(0);
			// result = result + nextInitial.toUpperCase();
		// }
		
		// return result;
	// }


}

