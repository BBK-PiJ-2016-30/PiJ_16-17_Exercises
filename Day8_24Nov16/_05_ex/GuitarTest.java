public class GuitarTest{
	public static void main(String [] args){
		GuitarTest testGuitar = new GuitarTest();
		testGuitar.launch();
	}
	
	public void launch(){
		Guitar newGuitar = new Guitar();
		
		newGuitar.play();
		newGuitar.burn();
		
	}

}