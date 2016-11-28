/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class GenericStackImpl<T> implements GenericStack<T> {
    /**
     * The head of the stack: the visible node
     */
    private GenericStack<T> head;

    public GenericStackImpl<T>() {
	  this.head = null;
    }

    public void push(T value) {
	  StringStackNode newNode = new StringStackNode(newText);
	  if (head != null) {
		newNode.setNext(head);
	  }
	  this.head = newNode;	  
    }

    public T pop() {
	  if (head == null) {
		return null;
	  }
	  T result = head.getText();
	  head = head.getNext();
	  return result;
    }

    public String peek() {
	  if (head == null) {
		return null;
	  } else {
		return head.getText();
	  }
    }

    public boolean isEmpty() {
	  if (getSize() == 0) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
     * Returns the number of string in the stack
     */
    public int getSize() {
	  int result = 0;
	  StringStackNode currentNode = head;
	  while (currentNode != null) {
		currentNode = currentNode.getNext();
		result++;
	  }
	  return result;
    }
}