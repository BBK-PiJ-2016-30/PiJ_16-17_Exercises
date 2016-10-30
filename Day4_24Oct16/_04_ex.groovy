//Binary and hexadecimal
//program to define a number of methods

int power (int b, int e){
	// take int b and int e
	//returns b to the power of e
	return b**e
}

int power16(int e){
	//takes int e
	//return 2 to the power of e
	return power(16, e)
}

int hexaDecimal2decimal(String str){
	//takes string outputs int
	def hexChars = ["0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"]
	//remove 0x
	str = str - "0x"
	int count = str.length()-1
	int decSum = 0
	for(i in str){
		decSum = decSum + hexChars.indexOf(i)*power16(count)
		count --
	}
	return decSum
}

String decimal2hexaDecimal(int b){
	//takes int outputs binary string
	def hexChars = ["0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"]
	String hexOut = ""
		
	while(b >0){
		hexOut = hexOut + hexChars[b%16]
		b = b/16
	}
	return "0x"+ hexOut.reverse()
}

void getDecimal(){
	print "Please enter an integer: ";
	String str = System.console().readLine()
	println str + " in hex is " + decimal2hexaDecimal(Integer.parseInt(str)) + "\n"
}

void getHex(){
	print "Please enter a hex string including 0x: ";
	String str = System.console().readLine()
	println str + " in decimal is " + hexaDecimal2decimal(str) + "\n"
}

boolean running = true
while(running){
	println "What would you like to do?";
	println "1 - Convert hex to decimal"
	println "2 - Convert decimal to hex"
	println "0 - Exit program"
	print "Please make your choice >> "
	String str = System.console().readLine()
	int option = Integer.parseInt(str)
	
	switch(option){
	case 0: running = false;
		break;
	case 1:	getHex();
		break;
	case 2:	getDecimal();
		break;
	default: println "Invalid option. Please try again."
	}
}
	
