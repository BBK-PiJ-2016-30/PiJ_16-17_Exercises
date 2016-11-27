public class Supermarket {
	
	private PersonQueue newQueue = new PersonQueueImpl();
	
	public void addPerson(Person person){
		newQueue.insert(person);
	}
	
	public Person servePerson(){
		Person toBeServed = newQueue.retrieve();
		if(toBeServed != null){
			//System.out.println("Now serving " + toBeServed.getName());
			return(toBeServed);
		}
		//System.out.println("Nobody left to serve.");
		return(null);
	}
	
}