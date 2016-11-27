public class SmartPhone extends MobilePhone{
	
	public SmartPhone(String brand) {
		super(brand);
	}
	
	
	/**
	*browse web
	*/
	public void browseWeb(String website){
		System.out.println("Browsing web on site " + website + "...");
	}
	
	/**
	*find fictitious GPS-found position
	*/
	public void findPosition(){
		System.out.println("GPS coordinates 51.52 N, 0.13 W");
	}
	
	/**
	* Call override for numbers starting with 00
	* rerouted through the internet
	*/
	@Override
	public void call(String number){
		//System.out.println(number.substring(0,2));
		if(number.substring(0,2).equals("00")){
			System.out.println("Calling " + number + " through the internet to save money");
			return;
		}
		super.call(number);
		return;
		
		
	}
	
}