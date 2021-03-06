public class PhoneLauncher2 {
	public static void main(String[] args) {
		
		PhoneLauncher2 launcher = new PhoneLauncher2();
		launcher.launch();
	}
	
	public void launch() {
		// your code creating and using SmartPhone here...
		RestrictedSmartPhone phoneTest = new RestrictedSmartPhone("Nokia");
		
		phoneTest.call("12345");
		phoneTest.call("0012345");
		phoneTest.ringAlarm("nokia");
		phoneTest.playGame("snake");
		
		for(int i = 0; i < 11; i++){
			phoneTest.addCalledNum("" + i);
		}
		
		phoneTest.printLastNumbers();
		phoneTest.browseWeb("Google");
		phoneTest.findPosition();
		
		System.out.println("Phone brand: " + phoneTest.getBrand());
	}
}