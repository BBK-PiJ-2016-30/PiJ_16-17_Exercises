public class Calculator{

	private void add(int a, int b){
		int result = a+b;
		System.out.println("Add: " + a + " + " + b + " = " + result);
	}

	private void subtract(int a, int b){
		int result = a-b;
		System.out.println("Subtract: " + a + " - " + b + " = " + result);
	}

	private void multiply(int a, int b){
		int result = a*b;
		System.out.println("Multiply: " + a + " * " + b + " = " + result);
	}

	private void divide(int a, int b){
		double x = (double) a;
		double y = (double) b;
		double result = x/y;
		System.out.println("Divide: " + a + " / " + b + " = " + result);
	}

	private void modulus(int a, int b){
		int result = a%b;
		System.out.println("Modulus: " + a + " % " + b + " = " + result);
	}

}