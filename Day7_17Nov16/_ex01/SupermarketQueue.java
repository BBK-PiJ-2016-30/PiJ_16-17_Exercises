public class SupermarketQueue implements PersonQueue{
	
	private Person firstPerson = null;
	private int perQueue = 0;
	
	/**
	*inserts person into the queue
	*/
	
	public void insert(Person person){
		Person current = this.firstPerson;
		
		if (firstPerson == null) {
			firstPerson = person;
			this.perQueue ++;
			return;
		}
		
		while (current.getNextPerson() != null) {
			// this means we are not yet at the end of the list
			current = current.getNextPerson();
		}
		// at this point, current points to the last patient
		current.setNextPerson(person);
		this.perQueue ++;
		
	}
	
	/**
	*retrieves next person from the queue
	*/
	
	public Person retrieve(){
		if (firstPerson == null) {
			// queue is empty, nothing to remove
			return null;
		}else {
			// first person in the list must be removed
			Person toBeServed = firstPerson;
			firstPerson = firstPerson.getNextPerson();
			this.perQueue --;
			return(toBeServed);
		}
	}
	
	public int getQLen(){
		return(this.perQueue);
	}
	

}