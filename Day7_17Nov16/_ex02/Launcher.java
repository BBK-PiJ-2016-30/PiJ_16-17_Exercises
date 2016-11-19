public class Launcher{
	public static void main(String [] args){
		Supermarket newSM = new Supermarket();
		
		for(int i=0; i<10; i++){
			Person newPer = new Person(("Person"+i),(20+i));
			newSM.addPerson(newPer);
		}
		
		System.out.println("Queue has " + newSM.getQLenSM() + " people.\n");
		
		Person current = newSM.servePerson();
		do{
			System.out.println("Now serving " + current.getName());
			current = newSM.servePerson();
		}while(current != null);

		System.out.println("\nQueue has " + newSM.getQLenSM() + " people.");

	}
}