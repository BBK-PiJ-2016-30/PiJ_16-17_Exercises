//command-line calculator
//input: reads test representing a mathematical operation(one of the four basic ones, 2 operands
//output: the result

String str = ""
double num1 = 0.0
double num2 = 0.0
def operatorList = ["+","-","*", "/"]
int option = 0
int operatorLoc = 0
int strLen = 0

//1. enter calculation and store in string
print("Please enter calculation: ")
str = System.console().readLine()

//2. find the operator used and index of it

for(item in operatorList){
	if(str.contains(item)){
		option = operatorList.indexOf(item)+1
		operatorLoc = str.indexOf(item)
		strLen = str.length()
		num1 = Double.parseDouble(str[0..operatorLoc-1])
		num2 = Double.parseDouble(str[operatorLoc+1..str.length()-1])
	}
}

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



