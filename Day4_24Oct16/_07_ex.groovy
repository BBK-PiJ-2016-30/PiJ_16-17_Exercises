//A bit more practice with doubles

class Mortgage {
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
		return amtBorrow*(1+(intRate/100))
	
	}

	double paymentYearly(){
	//returns total to be paid each year
		return totalMortgage()/years
	
	}

	double yearsToPayInt(){
	//years until interest is paid and only capital remains
		double interest = totalMortgage() - amtBorrow
		return interest/paymentYearly()
		
	}
}	

void requestMortgage(Mortgage x){
	print "Please enter your mortgage amount: "
	String str = System.console().readLine()
	x.setBorrow(Double.parseDouble(str))
}

void requestYears(Mortgage x){
	print "Please enter the number of years to pay back your mortgage: "
	String str = System.console().readLine()
	x.setYears(Double.parseDouble(str))
}

void requestIntRate(Mortgage x){
	print "Please enter the interest rate on your mortgage: "
	String str = System.console().readLine()
	x.setIntRate(Double.parseDouble(str))
}

boolean running = true
Mortgage mortCheck = new Mortgage()

requestMortgage(mortCheck)
requestYears(mortCheck)
requestIntRate(mortCheck)

println("------------");
println("Mortgage details are:");
println("------------");
println("The total amount to be paid for a mortgage of " + mortCheck.amtBorrow + " is " + mortCheck.totalMortgage().round(2));
println("The amount to be paid every year is " + mortCheck.paymentYearly().round(0));
println("The interest wll be paid after " + mortCheck.yearsToPayInt().round(2) + " years");

