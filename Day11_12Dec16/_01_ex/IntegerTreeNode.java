
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
		
		String treeOut = "";
		treeOut = treeOut + "[" + this.value;
	

		if(left == null){
			treeOut = treeOut + " L[]";
		}else{
			treeOut = treeOut + " L" + left.toString();
		}
		
		if(right == null){
			treeOut = treeOut + " R[]";
		}else{
			treeOut = treeOut + " R" + right.toString();
		}
		
		return(treeOut +"]");
		

	}
	
	public String toStringSimple(){
		
		String treeOut = "";
		treeOut = treeOut + "[" + this.value;
	

		if(left == null){
			treeOut = treeOut + "";
		}else{
			treeOut = treeOut + " " + left.toStringSimple();
		}
		
		if(right == null){
			treeOut = treeOut + "";
		}else{
			treeOut = treeOut + " " + right.toStringSimple();
		}
		
		return(treeOut +"]");
		

	}
	
	public int depth(){
		
		int leftCount = 0;
		int rightCount = 0;
		
		if(left == null){
			leftCount = leftCount + 0;
		}else{
			leftCount = 1 + left.depth();
		}
		
		if(right == null){
			rightCount = rightCount + 0;
		}else{
			rightCount = 1 + right.depth();
		}
		
		if(leftCount> rightCount){
			return leftCount;
		}else{
			return rightCount;
		}
		
	}
	
}