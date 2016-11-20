class ListPoint{

	private int ListInt;
	private ListPoint nextInt;
	
	public ListPoint(int ListInt) {
		this.ListInt = ListInt;
		this.nextInt = null;
	}

	public int getPoint(){
		return (this.ListInt);
	}
	
	public ListPoint getNextPoint(){
		return(this.nextInt);
	}
	
	public void setNextPoint(ListPoint nextInt){
		this.nextInt = nextInt;
	}
	
}