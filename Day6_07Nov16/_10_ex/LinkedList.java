public class LinkedList{
	
	private ListPoint firstPoint = null;
	private int ListLen = 0;
	
	public LinkedList(){
		
	}
	/**
	*insert point in list
	*/
	public void insertPoint(ListPoint point){
		//System.out.println(point.getPoint());
		if (firstPoint == null) {
			firstPoint = point;
			this.ListLen ++;
			return;
		}
		
		ListPoint curPoint = firstPoint;
		if(firstPoint.getPoint() <= point.getPoint()){

			int count = 0;
			while(curPoint.getNextPoint()!=null){
				//System.out.println(count++);
				if(point.getPoint() >= curPoint.getPoint() &
				point.getPoint() <= curPoint.getNextPoint().getPoint()){
					//System.out.println("in if");
					//not right or not working
					point.setNextPoint(curPoint.getNextPoint());
					curPoint.setNextPoint(point);
					this.ListLen ++;
					return;
				}
				curPoint = curPoint.getNextPoint();
			}
			curPoint.setNextPoint(point);
			this.ListLen ++;
			return;
		} else {
			point.setNextPoint(firstPoint);
			firstPoint = point;
			this.ListLen ++;
			return;
		}
		
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
				System.out.println(curPoint.getPoint());
			}
			
			curPoint = curPoint.getNextPoint();
		}while(curPoint != null);
		
	}

}