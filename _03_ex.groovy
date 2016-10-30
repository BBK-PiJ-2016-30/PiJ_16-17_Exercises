//Binary and decimal
//program to define a number of methods

int power(int b, int e){
	// takes base b and exponential e
	// return b to the power of e

	return b**e;
}

int power2(int e){
	//takes exponent e
	//returns 2 to the power of e

	return power(2, e);	
}

println power2(3)

int binary2decimal(String str){
	//takes a string

	int decTot = 0;
	int count = str.length();
	for(int i = (str.length()-1); i <0; i--){
		decTot = decTot + power2(i);	
	}
	return decTot;
}

println binary2decimal("101")


String decimal2binary (String str){
	//takes a string
	int userDec = Integer.parseInt(str)
	String binOut = ""
	
	while(remainder >0){
		binOut = binOut + (userDec%2)
		userDec = userDec/2
	}
	return binOut;
}

print decimal2binary("5")