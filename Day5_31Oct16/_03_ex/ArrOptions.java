public class ArrOptions{

	public void userArr(){
		System.out.println("To be finished");
	}
	
	public void arrayTest(){
		
		int [] srcSame = {1,2,3,41,2,9,10,8,12,56};
		int [] srcSmall = {1,2,3,41};
		int [] srcBig = {1,2,3,41,2,9,10,8,12,56,101,202};
		int [] dst = {101,102,103,104,105,106,107,108,109,110};
		
		ArrayCopier testCopy = new ArrayCopier();
		System.out.println("");
		System.out.println("Original destination array");
		arrayPrint(dst);
		System.out.println("");
		System.out.println("Test 1, both arrays are of the same size");
		testCopy.copy(srcSame,dst);
		arrayPrint(dst);
		System.out.println("");
		System.out.println("Test 2, the source array is longer");
		testCopy.copy(srcBig,dst);
		arrayPrint(dst);
		System.out.println("");
		System.out.println("Test 3, the source array is shorter");
		testCopy.copy(srcSmall,dst);
		arrayPrint(dst);
		System.out.println("");
	}
	
	public void arrayPrint(int [] arr){
		for(int i =0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}


}