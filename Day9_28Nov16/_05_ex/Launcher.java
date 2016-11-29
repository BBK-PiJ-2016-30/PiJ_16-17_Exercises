public class Launcher{
	public static void main(String [] args){
		Launcher test = new Launcher();
		
		test.launch();
	}
	
	public void launch(){
		GenericStackImpl<Integer> intStack = new GenericStackImpl<>();
		GenericStackImpl<Double> doubleStack = new GenericStackImpl<>();
		
		//shouldn't work as class only allows Number types
		//doesn't compile as String is not permitted
		//GenericStackImpl<String> strStack = new GenericStackImpl<>();
	
		//add ints to int stack
		for(int i = 0; i <5; i++){
			intStack.push(i);
		}
		//add Double to Double stack
		for(Double j = 0.0; j <5.0; j++){
			doubleStack.push(j);
		}
		
		//pop int stack
		do{
			System.out.println(intStack.pop());
		}
		while(!intStack.isEmpty());
		
		//pop Double stack
		do{
			System.out.println(doubleStack.pop());
		}
		while(!doubleStack.isEmpty());
	
	}

}