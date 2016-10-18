//calculator
//input: read two numbers from the users
// then offers four basic operations - addition, subtraction, multiplication, division
//output: 

String str = ""
double num1 = 0.0
double num2 = 0.0
def operatorList = ["+","-","*", "/"]
int option = 0

for(i=0;i<2;i++){
	if(i==0){
		print("Please enter a number: ")
		str = System.console().readLine()
		num1 = Double.parseDouble(str)		
	} else{
		print("Please enter another number: ")
		str = System.console().readLine()
		num2 = Double.parseDouble(str)
		print("What would you like to do: +, -, *, / : ")
		str = System.console().readLine()
		option = operatorList.indexOf(str) + 1
		println option
		switch(option){
			case 1: 
				print(num1 + num2)
				break;
			case 2: 
				print(num1 - num2)
				break;
			case 3: 
				print(num1 * num2)
				break;
			case 4: 
				print(num1 / num2)
				break;
			default: 
				print("Crash, ahhhhh!")
				break;

		}
	}
}

