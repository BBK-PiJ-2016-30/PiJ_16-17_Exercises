public class PhoneLauncher {
	public static void main(String[] args) {
		
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		// your code creating and using SmartPhone here...
		SmartPhone phoneTest = new SmartPhone("Nokia");
		
		System.out.println("Phone brand: " + phoneTest.getBrand());
	}
}