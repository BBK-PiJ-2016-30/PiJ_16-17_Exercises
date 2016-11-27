
public class StringExtend extends String {
	
	/*
	*prints on the screen the even numbered characters of string
	*/
	public void printEven(String str){
		for(int i = 0; i < str.length(); i++){
			if(i/2 == 0){
				System.out.println(i);
			}
		}
		
	}
}