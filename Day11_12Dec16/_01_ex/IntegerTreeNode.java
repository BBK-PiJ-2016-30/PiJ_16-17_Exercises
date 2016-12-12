
public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	
	public IntegerTreeNode(){

		left = null;
		right = null;
	}
	
	public IntegerTreeNode(int n){
		this.value =  n;
	}
	
	public void add(int newNum){
		if(newNum > this.value){
			if(right == null){
				right = new IntegerTreeNode(newNum);
			}else{
				right.add(newNum);
			}
		}else{
			if(left == null){
				left = new IntegerTreeNode(newNum);
			}else{
				left.add(newNum);
			}
		}
	}
	
	public boolean contains(int checkInt){
		if(checkInt == this.value){
			return true;
		} else if(checkInt > this.value){
			if(right == null){
				return false;
			}else{
				return right.contains(checkInt);
			}
		}else{
			if(left == null){
				return false;
			}else{
				return left.contains(checkInt);
			}
		}
	}
	
	public int getMax(){
		
		if(right ==null){
			return (this.value);
		}else{
			return (right.getMax());
		}

	}
	
	public int getMin(){
		if(left == null){
			return (this.value);
		}else{
			return(left.getMin());
		}

	}
	
	public String toString(){
		if()
	}
	
}