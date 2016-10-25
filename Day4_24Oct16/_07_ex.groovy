//A bit more practice with doubles

class Mortage {
	double amtBorrow;
	double years;
	double intRate;

	void setBorrow(double i){
	//sets amount borrowed
		amtBorrow = i;
	}
	
	void setYears(double i){
	//sets amount of years the mortgage is borrowed for
		years = i;
	}
	
	void setIntRate(double i){
	//sets mortgage interest rate
		intRate = i;
	}

	double totalMortgage(){
	//returns the total amount of the mortgage
	
	}

	double paymentYearly(){
	//retruns total to be paid each year
	
	}

	double payInt(){
	//years until interest is paid and only capital remains
	}
}	

void requestMortgage(Mortgage x){
	print "Please the amount borrowed for your mortgage: "
	String str = System.console().readLine()
	x.setBorrow = Double.parseDouble(str)
}

void requestYears(Mortgage x){
	print "Please enter the number of years to pay back your mortgage: "
	String str = System.console().readLine()
	x.setYears = Double.parseDouble(str)
}

void requestIntRate(Mortgage x){
	print "Please enter the interest rate on your mortgage: "
	String str = System.console().readLine()
	x.setIntRate = Double.parseDouble(str)
}

