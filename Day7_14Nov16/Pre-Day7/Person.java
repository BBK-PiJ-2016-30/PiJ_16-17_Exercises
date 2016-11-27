public class Person {
	private String name;
	private int age;
	private Person nextPerson;
	private Person prevPerson;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPerson = null; // Pointer to another Person!
		this.prevPerson = null; // Pointer to previous Person!
	}
	
	public Person getNextPerson(){
		return(this.nextPerson);
	}
	
	public Person getPrevPerson(){
		return(this.prevPerson);
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
	
	public void setNextPerson(Person nextPer){
		this.nextPerson = nextPer;
	}
	
	public void setPrevPerson(Person prevPer){
		this.prevPerson = prevPer;
	}
	
}