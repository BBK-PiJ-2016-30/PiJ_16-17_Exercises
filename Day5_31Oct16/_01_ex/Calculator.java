public class Calculator{

	void add(int a, int b){
		int result = a+b;
		System.out.println("Add: " + a + " + " + b + " = " + result);
	}

	void subtract(int a, int b){
		int result = a-b;
		System.out.println("Subtract: " + a + " - " + b + " = " + result);
	}

	void multiply(int a, int b){
		int result = a*b;
		System.out.println("Multiply: " + a + " * " + b + " = " + result);
	}

	void divide(int a, int b){
		double x = (double) a;
		double y = (double) b;
		double result = x/y;
		DecimalFormat df = new DecimalFormat("#.00");
		df.format(result);
		System.out.println("Divide: " + a + " / " + b + " = " + result);
	}

	void modulus(int a, int b){
		int result = a%b;
		System.out.println("Modulus: " + a + " % " + b + " = " + result);
	}

}