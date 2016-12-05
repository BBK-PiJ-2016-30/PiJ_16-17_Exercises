public class PalinCheckImpl implements PalinCheck{
	
	public boolean iterCheck(String palin){
		if(palin.equals("") || (palin.length() == 1)){
			return true;
		}		
		for(int i = 0; i < (palin.length()-1); i++){
			if(palin.charAt(i) != palin.charAt((palin.length()-1)-i)){
				return false;
			}else if(i == (palin.length()-1)-i){
				return true;
			}
		}
		return true;
	}
	
	public boolean recurCheck(String palin){
		if(palin.equals("") || (palin.length() == 1)){
			return true;
		}else if(palin.charAt(0) == palin.charAt(palin.length()-1)){
			return recurCheck(palin.substring(1,palin.length()-1));
		}else{
			return false;
		}
	}
	
	public static void main(String [] args){
		PalinCheck testPal = new PalinCheckImpl();
		
		System.out.print("Please enter string to test: ");
		String ans1 = System.console().readLine();
		System.out.print("[R]ecursive or [I]terative ? : ");
		String ans2 = System.console().readLine();
		switch(ans2.toLowerCase()){
			case "r":
				System.out.println("Result = " + testPal.recurCheck(ans1));
				break;
			case "i":
				System.out.println("Result = " + testPal.iterCheck(ans1));
				break;
			default:
				System.out.println("Invalid option");
				break;
		}
		
	}
}