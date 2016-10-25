//More on points

class Integer2 {
	int value;

	int getValue(){
	//returns the value of as an int - getter
		return value;
	}
	
	void setValue(int i){
	//sets value - setter
		value = i;
	}
	
	boolean isEven(){
	// return true if even false otherwise
		return value%2 == 0;
	}

	boolean isOdd(){
	// opposite of even
		return !isEven();
	}

	void prettyPrint(){
	// prints value of integer on screen
		println value;
	}

	String toString(){
	//returns a String equiv of the number
		return "" + value;
	}
}	


Integer2 i2 = new Integer2();
print "Enter a number: ";
String str = System.console().readLine();
int i = Integer.parseInt(str);
i2.setValue(i);

print "The number you entered is "
if (i2.isEven()) {
	println "even.";
} else if (i2.isOdd()) {
	println "odd.";
} else {
	println "undefined!! Your code is buggy!";
}

int parsedInt = Integer.parseInt(i2.toString());

if (parsedInt == i2.getValue()) {
	println("Your toString() method seems to work fine.");
}