public class TestScript {
    public static void main(String[] args){
		boolean running = true;
		while(running){
			System.out.println("-----------------");
			System.out.println("To set arrays manually enter 1");
			System.out.println("To run series of array test enter 2");
			System.out.println("To exit enter 0");
			System.out.print("Please make a selection: ");
			int menuOp = Integer.parseInt(System.console().readLine());
			ArrOptions testArr = new ArrOptions();
			switch(menuOp){
				case 0: 
					running = false;
					break;
				case 1:
					testArr.userArr();
					break;
				case 2:
					testArr.arrayTest();
					break;
				default: System.out.println("Invalid option. Please try again.");
			}
		}
	}	
}