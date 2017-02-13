public class exercise1{
	
	String doggyMethod(int n){
		//
		
		if(n <= 0){
			System.out.println("");
			return "";
		}
		//String result = doggyMethod(n-1);
		String result = doggyMethod(n-3) + n + doggyMethod(n-2);
		System.out.println(result);
		return result;
	}
	
	int mcCarthy91(int n) {
		if (n > 100) {
			System.out.print("n = "+n+" -- ");
			System.out.print("n bigger than 100 -- returning -- ");
			System.out.println("" + (n-10));
			return n - 10;
		} else {
			System.out.print("n = "+n+" -- ");
			System.out.println("n less than 100");
			return mcCarthy91(mcCarthy91(n+11));
		}
	}

}