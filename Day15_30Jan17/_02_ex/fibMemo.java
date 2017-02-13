import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class fibMemo{
	static Map<Long,Long> resultHistory = new HashMap<>();
	
	public static long fib(long n){
		if(n==0){
			return 0;
		}
		if ((n == 1) || (n == 2)){
			return 1;
		} else {
			if(resultHistory.containsKey(n)){
				return resultHistory.get(n);
			}
			long result = fib (n - 1) + fib(n - 2);
			resultHistory.put(n, result);
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