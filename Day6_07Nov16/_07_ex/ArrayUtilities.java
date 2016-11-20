class ArrayUtilities{

	public static LinkedList intArrToList(int [] intArr){
		/**
		*converts integer arry to linked list
		*/
		int ArrLen = intArr.length;
		LinkedList ArrList = new LinkedList();
		ListPoint newPoint = null;
		for(int i = 0; i < ArrLen; i++){
			newPoint = new ListPoint(intArr[i]);
			ArrList.insertPoint(newPoint);
		}
		return(ArrList);
	}
}