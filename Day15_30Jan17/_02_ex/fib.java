import java.time.Duration;
import java.time.Instant;

public class fib{
	
	public static long fib(long n){
		if(n == 0){
			return 0;
		}
		if ((n == 1) || (n == 2)){
			return 1;
		} else {
			long result = fib (n - 1) + fib(n - 2);
			return result;
		}
	}
	
	public static void main(String [] args){
		fibMemo testClass = new fibMemo();
		
		long input = Long.parseLong(args[0]);
		Instant start = Instant.now();
		System.out.println(testClass.fib(input));
		Instant end = Instant.now();
		
		System.out.println("Timing: " + Duration.between(start, end).toNanos());
	}
	
	
}