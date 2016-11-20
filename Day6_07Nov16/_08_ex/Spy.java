public class Spy {
	
	private static int spyCount = 0;
	private int spyID;
	
	public Spy(int spyID){
		this.spyID = spyID;
		spyCount ++;
		System.out.println("Spy ID: " + this.spyID + ". Total spies so far = " + spyCount);
	}
	
	public void die(){
		System.out.println("Spy " + spyID + " has been detected and eliminated");
		spyCount --;
		System.out.println("Total spies so far = " + spyCount);
	}

}