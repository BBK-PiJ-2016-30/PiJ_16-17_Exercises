public class GenericList<T> {
	
	private GenericNode<T> firstNode = null;
	private int listLen = 0;
	
	/**
	*add node to generic list
	*/
	public void addNode(T nodeVal) {
		GenericNode<T> newNode = new GenericNode<T>(nodeVal);
		GenericNode<T> current = this.firstNode;
		
		if (firstNode == null) {
			firstNode = newNode;
			this.listLen ++;
			return;
		}
		
		while (current.getNextNode() != null) {
			// this means we are not yet at the end of the list
			current = current.getNextNode();
		}
		
		// at this point, current points to the last Node
		current.setNextNode(newNode);
		newNode.setPrevNode(current);
		this.listLen ++;
		
	}
	
	/**
	*returns true if the Node was found and removed, false otherwise
	*/
	public boolean deleteNode(T nodeVal) {
		GenericNode<T> newNode = new GenericNode<T>(nodeVal);
		if (firstNode == null) {
			// list is empty, nothing to remove
			return false;
		}
		
		if (firstNode.getNode().equals(newNode.getNode())) {
			// first Node in the list must be removed
			if(firstNode.getNextNode() == null){
				//one person list
				firstNode = null;
			}else{
				firstNode.getNextNode().setPrevNode(null);
				firstNode = firstNode.getNextNode();
			}
			this.listLen --;
			return true;
		}
		
		GenericNode<T> current = firstNode;
		while (current.getNextNode() != null) {
			if (current.getNextNode().getNode().equals(newNode.getNode())) {
				// We found it! It is the next one!
				// Now link this Node to the one after the next
				current.setNextNode(current.getNextNode().getNextNode());
				//set prev Node
				current.getNextNode().getNextNode().setPrevNode(current);
				this.listLen --;
				return true;
			}
			current = current.getNextNode();
		}
		System.out.println(newNode.getNode() + " not in list");
		return false;
	}
	
	public GenericNode<T> getFirstNode(){
		return(firstNode);
	}
	
	public int getListLen(){
		return(this.listLen);
	}
	
	public void printList(){
			//System.out.println("List printed Forwards");
			if(firstNode==null){
				System.out.println("No one in the hosipital.");
			}
			
			GenericNode<T> current = firstNode;
			do{
				System.out.print("Node: ");
				System.out.println(""+current.getNode());
				current = current.getNextNode();
			}while(current != null);
	
	}
}