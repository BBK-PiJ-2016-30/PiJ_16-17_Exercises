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
		
		//
		// ListPoint curPoint = null;
		// ListPoint curPoint1 = firstPoint.getNextPoint();
		ListPoint curPoint = firstPoint;
		if(firstPoint.getPoint() <= point.getPoint()){
			// while(point.getPoint()>curPoint1.getPoint()){
				// curPoint = curPoint1;
				// curPoint1 = curPoint1.getNextPoint();
			// }
			// curPoint.setNextPoint(point);
			// point.setNextPoint(curPoint1);
			// this.ListLen ++;
			// return;
			int count = 0;
			while(curPoint.getNextPoint()!=null){
				System.out.println(count++);
				if(point.getPoint() >= curPoint.getPoint() &
				point.getPoint() <= curPoint.getNextPoint().getPoint()){
					curPoint.setNextPoint(point);
					point.setNextPoint(curPoint.getNextPoint());
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
				System.out.print(curPoint.getPoint());
			}
			
			curPoint = curPoint.getNextPoint();
		}while(curPoint != null);
		
	}

}