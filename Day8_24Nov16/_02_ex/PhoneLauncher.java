public class PhoneLauncher {
	public static void main(String[] args) {
		
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		// your code creating and using SmartPhone here...
		SmartPhone phoneTest = new SmartPhone();
		
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
	}
}