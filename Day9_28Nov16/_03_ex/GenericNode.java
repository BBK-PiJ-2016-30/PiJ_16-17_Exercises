public class GenericNode<T> {
	private T Node;
	private GenericNode<T> nextNode;
	private GenericNode<T> prevNode;
	
	public GenericNode(T Node) {
		this.Node = Node;
		this.nextNode = null; // Pointer to next Node
		this.prevNode = null; // Pointer to previous Node
	}
	
	public GenericNode<T> getNextNode(){
		return(this.nextNode);
	}
	
	public GenericNode<T> getPrevNode(){
		return(this.prevNode);
	}
	
	public T getNode(){
		return (this.Node);
	}
	
	public void setNextNode(GenericNode<T> nextNode){
		this.nextNode = nextNode;
	}
	
	public void setPrevNode(GenericNode<T> prevNode){
		this.prevNode = prevNode;
	}
	
}