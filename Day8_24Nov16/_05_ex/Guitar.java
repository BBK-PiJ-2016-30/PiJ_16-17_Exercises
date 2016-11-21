public class Guitar implements MusicalInstrument, WoodenObject{

	//implemented from woodenobject
	public void burn(){
		System.out.println("Do I smell burning?!?");
	}
	
	//implemented from musicalInstrument
	public void play(){
		System.out.println("Plays some lovely music...");
	}

}

