public class LinkedList{
	
	private ListPoint firstPoint = null;
	private int ListLen = 0;
	
	public LinkedList(){
		
	}
	/**
	*insert point in list
	*/
	public void insertPoint(ListPoint point){
		if (firstPoint == null) {
			firstPoint = point;
			this.ListLen ++;
			return;
		}
		
		ListPoint curPoint = firstPoint;
		while (curPoint.getNextPoint() != null) {
			curPoint = curPoint.getNextPoint();
		}
		
		curPoint.setNextPoint(point);
		this.ListLen ++;
	}
	
	/**
	*print list
	*/
	public void printList(){
		if (firstPoint == null) {
			// queue is empty, nothing to remove
			System.out.println("Nothing in list");
			return;
		}
		
		ListPoint curPoint = firstPoint;
		do{
			if(curPoint.getNextPoint()!=null){
				System.out.print(curPoint.getPoint() + ",");
			}else{
				System.out.print(curPoint.getPoint());
			}
			
			curPoint = curPoint.getNextPoint();
		}while(curPoint != null);
		
	}

}