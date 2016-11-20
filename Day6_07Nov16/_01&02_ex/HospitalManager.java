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
			firstPatient = firstPatient.getNextPatient();
			this.patQueue --;
			return true;
		}
		
		Patient current = firstPatient;
		while (current.getNextPatient() != null) {
			if (current.getNextPatient().getName().equals(name)) {
				// We found it! It is the next one!
				// Now link this patient to the one after the next
				current.setNextPatient(current.getNextPatient().getNextPatient());
				this.patQueue --;
				return true;
			}
			current = current.getNextPatient();
		}
		return false;
	}
	
	public Patient getFirstPatient(){
		return(firstPatient);
	}
	
	public int getQueue(){
		return(this.patQueue);
	}
	
	public void getPatient (Patient current){
		
			System.out.println("Patient: ");
			System.out.print(current.getName() + " ");
			System.out.print(current.getAge() + " ");
			System.out.println(current.getIllness());
			
			
	}
	public static void main(String [] args){
		
		HospitalManager newHosp = new HospitalManager();
		//arrPat = new Patient[10];
		//Patient pat1 = new Patient("Pat1","20","Unknown")
		
		for(int i=0; i<10; i++){
			Patient newPat = new Patient(("Pat"+i),(20+i),"Unknown");
			newHosp.addPatient(newPat);
		}
		
		Patient current = newHosp.getFirstPatient();
		while (current != null){
			newHosp.getPatient(current);
			current = current.getNextPatient();
		}
		System.out.println("Patients in queue: " + newHosp.getQueue());
		
		newHosp.deletePatient("Pat5");
		newHosp.deletePatient("Pat7");
		System.out.println();
		
		current = newHosp.getFirstPatient();
		while (current != null){
			newHosp.getPatient(current);
			current = current.getNextPatient();
		}
		
		
		System.out.println("Patients in queue: " + newHosp.getQueue());
	}


}