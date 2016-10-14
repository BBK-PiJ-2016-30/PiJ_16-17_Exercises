//Prime numbers
//input: number from user
//output: whether number is prime or not

String str = ""
print "Please enter a number: "
str = System.console().readLine()
int checkNum = Integer.parseInt(str)
int i = 2
while(i<= checkNum){
	if (checkNum == i){
		print checkNum + " is a prime number."
		break;
	} else if (checkNum % i == 0){
		print checkNum + " is not a prime number."
		break;
	} else{
		i++
	}
}
