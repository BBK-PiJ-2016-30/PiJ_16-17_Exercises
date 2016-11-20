public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient prevPatient;
	
	public Patient(String name, int age, String illness) {
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null; // Pointer to another patient!
		this.prevPatient = null; // Pointer to previous patient!
	}
	
	public Patient getNextPatient(){
		return(this.nextPatient);
	}
	
	public Patient getPrevPatient(){
		return(this.prevPatient);
	}
	
	public String getName(){
		return (this.name);
	}
	
	public int getAge(){
		return(this.age);
	}
	
	public String getIllness(){
		return(this.illness);
	}
	
	public void setNextPatient(Patient nextPat){
		this.nextPatient = nextPat;
	}
	
	public void setPrevPatient(Patient prevPat){
		this.prevPatient = prevPat;
	}
	
}