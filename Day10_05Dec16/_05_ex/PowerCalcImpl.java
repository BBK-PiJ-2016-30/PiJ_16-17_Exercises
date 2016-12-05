public class PowerCalcImpl implements PowerCalc{
	
	public int iterPow(int val1, int val2){
		if(val2 == 0){
			return 1;
		}else if(val2 == 1){
			return val1;
		}
		
		int result = val1;
		for(int i = 1; i < val2; i++){
			result = result * val1;
		}
		return result;
	}
	
	public int recurPow(int val1, int val2){
		if(val2 == 0){
			return 1;
		}
		return val1 * recurPow(val1, val2-1);
	}
	
	public static void main(String [] args){
		PowerCalc testPow = new PowerCalcImpl();
		
		System.out.print("Please enter base: ");
		String ans1 = System.console().readLine();
		int num1 = Integer.parseInt(ans1);
		System.out.print("Please enter exponent: ");
		String ans2 = System.console().readLine();
		int num2 = Integer.parseInt(ans2);
		System.out.print("[R]ecursive or [I]terative ? : ");
		String ans3 = System.console().readLine();
		switch(ans3.toLowerCase()){
			case "r":
				System.out.println("Result = " + testPow.recurPow(num1, num2));
				break;
			case "i":
				System.out.println("Result = " + testPow.iterPow(num1, num2));
				break;
			default:
				System.out.println("Invalid option");
				break;
		}
		
	}
}