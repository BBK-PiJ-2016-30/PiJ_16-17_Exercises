//ex2 Checking arrays
public class ArrayChecker{
	public boolean isSymetrical(int [] symCheck){
		int size = symCheck.length-1;
		for(int i = 0; i < size+1; i++){
			if(symCheck[i] != symCheck[size-i]){
				return(false);
			}
		}
		return (true);
	}

	private int [] reverse(int [] reverse){
		int size = reverse.length-1;
		int [] reversedArr = new int[size+1];
		for(int i =0; i <size+1; i++){
			reversedArr[i] = reverse[size-i];
		}
		return(reversedArr);
	}

}
