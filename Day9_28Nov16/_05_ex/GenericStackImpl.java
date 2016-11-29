
public class GenericStackImpl<T extends Number> implements GenericStack<T> {
    /**
     * The head of the stack
     */
    private GenericStackNode<T> head = null;

    public void push(T value) {
	  GenericStackNode<T> newNode = new GenericStackNode<T>(value);
	  if (head != null) {
		newNode.setNext(head);
	  }
	  this.head = newNode;	  
    }

    public T pop() {
	  if (head == null) {
		return null;
	  }
	  T result = head.getValue();
	  head = head.getNext();
	  return result;
    }

    public T peek() {
	  if (head == null) {
		return null;
	  } else {
		return head.getValue();
	  }
    }

    public boolean isEmpty() {
	  if (head == null) {
		return true;
	  } else {
		return false;
	  }
    }

}