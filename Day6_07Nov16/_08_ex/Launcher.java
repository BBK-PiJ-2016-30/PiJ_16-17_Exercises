public class Launcher{
	public static void main(String [] args){
		//create spies
		Spy spy7 = new Spy(7);
		Spy spy2 = new Spy(2);
		Spy spy3 = new Spy(3);
		Spy spy5 = new Spy(5);
		Spy spy8 = new Spy(8);
		Spy spy10 = new Spy(10);
		
		//a few spies die
		spy10.die();
		spy3.die();
		spy5.die();		

	}
}