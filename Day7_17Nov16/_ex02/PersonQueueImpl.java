public class PersonQueueImpl implements PersonQueue{
	
	private int perQueue = 0;
	private Person [] personArry = new Person[10];
	
	/**
	*Implements queue as map rather than linked list
	*/
	
	/**
	*inserts person into the queue
	*/
	
	public void insert(Person person){
		if(perQueue == 10){
			System.out.println("Queue is full");
		}else{
			personArry[perQueue] = person;
			perQueue++;
		}	
	}
	
	/**
	*retrieves next person from the queue
	*/
	
	public Person retrieve(){
		if(personArry[0] == null){
			System.out.println("Nobody in the queue");
			return(null);
		}else{
			Person toBeServed = personArry[0];
			for(int i = 0; i < (perQueue-1); i++){
				personArry[i] = personArry[i+1];
			}
			personArry[perQueue-1] = null;
			perQueue --;
			return(toBeServed);
		}
	}
	
	public int getQLen(){
		return(this.perQueue);
	}
	

}