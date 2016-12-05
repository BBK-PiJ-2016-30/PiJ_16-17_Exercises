public class FactorialImpl implements Factorial{
	
	public int IterFact(int value){
		int result = value;
		
		for(int i =(value-1); i > 0; i-- ){
			result = result * i;
		}
		return result;
	}
	
	public int RecurFact(int value){
		if(value == 1){
			return 1;
		}else{
			return(value*RecurFact(value-1));
		}
	}
	
	public static void main(String [] args){
		Factorial factTest = new FactorialImpl();
		System.out.print("Plase enter an interger to return Factorial: ");
		String ans1 = System.console().readLine();
		System.out.print("[R]ecursive or [I]terative ? : ");
		String ans2 = System.console().readLine();
		switch(ans2.toLowerCase()){
			case "r":
				System.out.println("Factorial = " + factTest.RecurFact(Integer.parseInt(ans1)));
				break;
			case "i":
				System.out.println("Factorial = " + factTest.IterFact(Integer.parseInt(ans1)));
				break;
			default:
				System.out.println("Invalid option");
				break;
		}

	}
	
}