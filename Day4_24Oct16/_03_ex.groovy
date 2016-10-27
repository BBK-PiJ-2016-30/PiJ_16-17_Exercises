//Binary and decimal
//program to define a number of methods

int power (int b, int e){
	// take int b and int e
	//returns b to the power of e
	return b**e
}

int power2(int e){
	//takes int e
	//return 2 to the power of e
	return power(2, e)
}

int binary2decimal(String str){
	//takes string outputs int
	int count = str.length()-1
	int decSum = 0
	for(i= 0; i < str.length(); i++){
		if(str.charAt(i)!="0"){
			decSum = decSum + power2(count)
		}
		count --
	}
	return decSum
}

String decimal2binary(int b){
	//takes int outputs binary string
	String binOut = ""
		
	while(b >0){
		binOut = binOut + b%2
		b = b/2
	}
	return binOut
}

void getDecimal(){
	print "Please enter an integer: ";
	String str = System.console().readLine()
	println str + " in binary is " + decimal2binary(Integer.parseInt(str)) + "\n"
}

void getBinary(){
	print "Please enter a binary string: ";
	String str = System.console().readLine()
	println str + " in decimal is " + binary2decimal(str) + "\n"
}

boolean running = true
while(running){
	println "What would you like to do?";
	println "1 - Convert binary to decimal"
	println "2 - Convert decimal to binary"
	println "0 - Exit program"
	print "Please make your choice >> "
	String str = System.console().readLine()
	int option = Integer.parseInt(str)
	
	switch(option){
	case 0: running = false;
		break;
	case 1:	getBinary();
		break;
	case 2:	getDecimal();
		break;
	default: println "Invalid option. Please try again."
	}
}
	
