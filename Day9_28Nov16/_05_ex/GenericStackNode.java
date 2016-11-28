/**
 * A node in a dynamic singly-linked list of Generics
 */
public class GenericStackNode<T> {
    private T value;
    private GenericStackNode<T> next;

    public GenericStackNode(T value) {
	  this.value = value;
	  this.next = null;
    }

    /**
     * Returns the value in this node
     */
    public T getValue() {
	  return(value);
    }

    /**
     * Set the next node to point to the given node
     */
    public void setNext(GenericStackNode<T> node) {
	  this.next = node;		
    }

    /**
     * Set the next node to point to the given node
     */
    public GenericStackNode<T> getNext() {
	  return(this.next);		
    }
}