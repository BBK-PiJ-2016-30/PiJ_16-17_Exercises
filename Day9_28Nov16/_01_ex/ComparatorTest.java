public class ComparatorTest{
	public static void main(String [] args){
		ComparatorTest testImprov = new ComparatorTest();
		
		testImprov.launch();
		
	}
	
	public void launch(){
		Comparator test = new Comparator();
		
		System.out.println("Int input " + test.getMax(10,12));
		System.out.println("Double input " + test.getMax(15.0,12.0));
		System.out.println("String input " + test.getMax("20","12"));
		
	}
}