public class RestrictedSmartPhone extends SmartPhone{
	
	public RestrictedSmartPhone(String brand) {
		super(brand);
	}
	
	/**
	*restricted smartphone playGame method
	*this overrides smatphone playgame but
	*not sure how to make smartPhone private
	*/
	@Override
	public void playGame(String game){
		System.out.println("Sorry can't play " + game);
		//this not sure how to make playgame in SmartPhone private from this method?
	}

	
}