public class PhoneLauncher {
	public static void main(String[] args) {
		
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		// your code creating and using SmartPhone here...
		//working
		SmartPhone phoneTest = new SmartPhone("Nokia");
		
		/**
		*using MobilePhone doesn't work as some methods are private to MobilePhone
		*and others aren't available at all as there only in SmartPhone
		*/
		//MobilePhone phoneTest = new SmartPhone("Nokia");
		
		PhoneLauncher tester = new PhoneLauncher();
		tester.testPhone(phoneTest);
		System.out.println("\nCasting exception\n");
		MobilePhone mobileTest = new MobilePhone("Mobile");
		tester.testPhone(mobileTest);
		/**
		*we encoutner an exception as MobilePhone cannot be case to SmaretPhone
		*/
		
			
		// phoneTest.call("12345");
		// phoneTest.call("0012345");
		// phoneTest.ringAlarm("nokia");
		// phoneTest.playGame("snake");
		
		// for(int i = 0; i < 11; i++){
			// phoneTest.addCalledNum("" + i);
		// }
		
		// phoneTest.printLastNumbers();
		// phoneTest.browseWeb("Google");
		// phoneTest.findPosition();
		
		// System.out.println("Phone brand: " + phoneTest.getBrand());
	}
	
	public void testPhone(Phone tester){
		tester.call("12345");
		tester.call("0012345");
		/**
		*call method works as it's the only one present in Phone
		*however it implements the SmartPhone implementation of call
		*/
		
		//downcast to SmartPhone
		SmartPhone dwnCastPhone = (SmartPhone) tester;
		
		//now all SmartPhone methods should work
		dwnCastPhone.ringAlarm("nokia");
		dwnCastPhone.playGame("snake");
		
		for(int i = 0; i < 11; i++){
			dwnCastPhone.addCalledNum("" + i);
		}
		
		dwnCastPhone.printLastNumbers();
		dwnCastPhone.browseWeb("Google");
		dwnCastPhone.findPosition();
		
		System.out.println("Phone brand: " + dwnCastPhone.getBrand());
	}
}