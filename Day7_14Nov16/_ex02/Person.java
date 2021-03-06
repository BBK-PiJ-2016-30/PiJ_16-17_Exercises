public class Person {
	private String name;
	private int age;
	private Person nextPerson;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPerson = null; // Pointer to another Person!
	}
	
	public Person getNextPerson(){
		return(this.nextPerson);
	}
	
	public String getName(){
		return (this.name);
	}
	
	public int getAge(){
		return(this.age);
	}
	
	public void setNextPerson(Person nextPer){
		this.nextPerson = nextPer;
	}
	
}