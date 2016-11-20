public class HospitalManager {
	
	private Patient firstPatient = null;
	private int patQueue = 0;
	
	// other methods come here...
	// this is a member method of class HospitalManager
	public void addPatient(Patient newPatient) {
		Patient current = this.firstPatient;
		int count = 0;
		
		if (firstPatient == null) {
			firstPatient = newPatient;
			this.patQueue ++;
			return;
		}
		
		count ++;
		while (count != patQueue) {
			// this means we are not yet at the end of the list
			current = current.getNextPatient();
			count ++;
		}
		
		// at this point, current points to the last patient
		current.setNextPatient(newPatient);
		current.getNextPatient().setNextPatient(firstPatient);
		this.patQueue ++;
		
	}
	
	// this is a member method of class HospitalManager
	// returns true if the patient was found and removed, false otherwise
	public boolean deletePatient(String name) {
		
		int count = 0;
		
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
				firstPatient = firstPatient.getNextPatient();
			}
			this.patQueue --;
			return true;
		}
		count ++;
		Patient current = firstPatient;
		while (count != patQueue) {
			if (current.getNextPatient().getName().equals(name)) {
				// We found it! It is the next one!
				// Now link this patient to the one after the next
				
				current.setNextPatient(current.getNextPatient().getNextPatient());
				
				this.patQueue --;
				return true;
			}
			current = current.getNextPatient();
			count ++;

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
	
	public void printPatientList (){
			int count = 0;
			System.out.println("Patient list");
			if(firstPatient==null){
				System.out.println("No one in the hosipital.");
			}
			
			Patient current = firstPatient;
			do{
				System.out.print("Patient: ");
				System.out.print(current.getName() + " - ");
				System.out.print(current.getAge() + " - ");
				System.out.println(current.getIllness());
				current = current.getNextPatient();
				count ++;
			}while(count != patQueue);
	
	}

}