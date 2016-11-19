public class PersonQueueImpl implements PersonQueue {

	//using BBK-PiJ-2016-14 personQueueImpl to test ex 03
	// used random number generator to find student
	
	//person methods were named differently so updated these
	//other than this implementation ran smoothly!
	
    // implement PersonQueue using a linked list for storage
  private Person head = null;

  public void insert(Person person) { // add person to back of queue
    if (head == null) {
      head = person;
      return;
    }
    Person current = head;
    while (current.getNextPerson() != null) {
      current = current.getNextPerson();
    }
    current.setNextPerson(person);
    return;
  }

  public Person retrieve () {
    if (head == null) {
      System.out.println("queue is empty!");
      return null;
    }
    Person firstInQueue = head;
    head = head.getNextPerson(); // head could now be null
    return firstInQueue;
  }

}