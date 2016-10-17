//calculator
//input: read two numbers from the users
// then offers four basic operations - addition, subtraction, multiplication, division
//output: 

String str = ""
double num1 = 0.0
double num2 = 0.0

for(i=0;i<2;i++){
	if(i==0){
		print("Please enter a number: ")
		str = System.console().readLine()
		num1 = Double.parseDouble(str)		
	} else{
		print("Please enter another number: ")
		str = System.console().readLine()
		num2 = Double.parseDouble(str)
		print("What would you like to do: +, -, *, \\ : ")
		str = System.console().readLine()
		print str
		switch(str){
			case "+": print(num1 + num2)
			case "-": print(num1 - num2)
			case "*": print(num1 * num2)
			case "\": print(num1 \ num2)
			default: "Crash, ahhhhh!"	

		}
	}
}

