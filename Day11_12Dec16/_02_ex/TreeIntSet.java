public class TreeIntSet implements IntSet{
	
	private int value;
	private IntSet right;
	private IntSet left;
	
	public TreeIntSet(int n){
		this.value = n;
	}
	
	public void add(int n){
		if(n > this.value){
			if(right == null){
				right = new TreeIntSet(n);
			}else{
				right.add(n);
			}
		}else{
			if(left == null){
				left = new TreeIntSet(n);
			}else{
				left.add(n);
			}
		}
	}
	
	public boolean contains(int n){
		if(n == this.value){
			return true;
		} else if(n > this.value){
			if(right == null){
				return false;
			}else{
				return right.contains(n);
			}
		}else{
			if(left == null){
				return false;
			}else{
				return left.contains(n);
			}
		}
	}
	
	public boolean containsVerbose(int n){
		System.out.println("Checking element " + n);
		return(contains(n));
	}
	
	public String toString(){
		
		String treeOut = "";
		treeOut = treeOut + this.value;
	

		if(left == null){
			treeOut = treeOut + "";
		}else{
			treeOut = treeOut + ", " + left.toString();
		}
		
		if(right == null){
			treeOut = treeOut + "";
		}else{
			treeOut = treeOut + ", " + right.toString();
		}
		
		return(treeOut);
		

	}
	
}