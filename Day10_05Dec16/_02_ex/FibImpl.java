public class FibImpl implements Fibonacci{
	
	public int IterFib(int value){
		if((value == 1) || (value==2)){
			return 1;
		}
		int fib2 = 1;
		int fib1 = 1;
		int tmp = 0;
		for(int i = value; i > 2; i--){
			tmp = fib2;
			fib2 = fib1 + fib2;
			fib1 = tmp;
		}
		return fib2;
	}
	
	public int RecurFib(int value){
		if ((value == 1) || (value==2)){
			return 1;
		}else{
			return (RecurFib(value-1) + RecurFib(value-2));
		}

	}
	
	public static void main(String [] args){
		Fibonacci fibTest = new FibImpl();
		
		System.out.print("Plase enter an interger to return the Fibonacci Sequence: ");
		String ans1 = System.console().readLine();
		System.out.print("[R]ecursive or [I]terative ? : ");
		String ans2 = System.console().readLine();
		switch(ans2.toLowerCase()){
			case "r":
				System.out.println("Result = " + fibTest.RecurFib(Integer.parseInt(ans1)));
				break;
			case "i":
				System.out.println("Result = " + fibTest.IterFib(Integer.parseInt(ans1)));
				break;
			default:
				System.out.println("Invalid option");
				break;
		}

	}
	
}