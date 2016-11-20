public class HospitalManager {
	
	private Patient firstPatient = null;
	private int patQueue = 0;
	
	// other methods come here...
	// this is a member method of class HospitalManager
	public void addPatient(Patient newPatient) {
		Patient current = this.firstPatient;
		
		if (firstPatient == null) {
			firstPatient = newPatient;
			this.patQueue ++;
			return;
		}
		
		while (current.getNextPatient() != null) {
			// this means we are not yet at the end of the list
			current = current.getNextPatient();
		}
		
		// at this point, current points to the last patient
		current.setNextPatient(newPatient);
		newPatient.setPrevPatient(current);
		this.patQueue ++;
		
	}
	
	// this is a member method of class HospitalManager
	// returns true if the patient was found and removed, false otherwise
	public boolean deletePatient(String name) {
		if (firstPatient == null) {
			// list is empty, nothing to remove
			return false;
		}
		
		if (firstPatient.getName().equals(name)) {
			// first patient in the list must be removed
			if(firstPatient.getNextPatient() == null){
				//one person list
				firstPatient = null;
			}else{
				firstPatient.getNextPatient().setPrevPatient(null);
				firstPatient = firstPatient.getNextPatient();
			}
			this.patQueue --;
			return true;
		}
		
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				// We found it! It is the next one!
				// Now link this patient to the one after the next
				current.setNextPatient(current.getNextPatient().getNextPatient());
				//set prev patient
				current.getNextPatient().getNextPatient().setPrevPatient(current);
				this.patQueue --;
				return true;
			}
			current = current.getNextPatient();
		}
		System.out.println(name + " not in list");
		return false;
	}
	
	public Patient getFirstPatient(){
		return(firstPatient);
	}
	
	public int getQueue(){
		return(this.patQueue);
	}
	
	public void printPatientListForwards (){
			System.out.println("List printed Forwards");
			if(firstPatient==null){
				System.out.println("No one in the hosipital.");
			}
			
			Patient current = firstPatient;
			do{
				System.out.println("Patient: ");
				System.out.print(current.getName() + " - ");
				System.out.print(current.getAge() + " - ");
				System.out.println(current.getIllness());
				current = current.getNextPatient();
			}while(current != null);
	
	}
	
	public void printPatientListbackwards (){
			System.out.println("List printed Backwards");
			if(firstPatient==null){
				System.out.println("No one in the hosipital.");
			}
			
			Patient current = firstPatient;
			
			while (current.getNextPatient() != null) {
				current = current.getNextPatient();
			}
			
			Patient lastPat = current;
			
			do{
				System.out.println("Patient: ");
				System.out.print(current.getName() + " - ");
				System.out.print(current.getAge() + " - ");
				System.out.println(current.getIllness());
				current = current.getPrevPatient();
			}while(current != null);
	
	}

}