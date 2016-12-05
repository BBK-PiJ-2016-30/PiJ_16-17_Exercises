import java.lang.Math; 
public class HanoiImpl implements Hanoi{
	
	public int HanMoves(int numDisc){
		if(numDisc == 1){
			return 1;
		}
		return(2*HanMoves(numDisc-1) +1);
	}
	

	public double HanMoves2(int numDisc){
		
		return(Math.pow((double) 2, (double) numDisc) - 1);
	}
	


	
	public static void main(String [] args){
		Hanoi hanTest = new HanoiImpl();
		
		System.out.print("Plase enter the number of discs: ");
		String ans1 = System.console().readLine();

		System.out.println("Result = " + hanTest.HanMoves(Integer.parseInt(ans1)));
		System.out.println("Result = " + hanTest.HanMoves2(Integer.parseInt(ans1)));

	}
	
}