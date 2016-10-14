//Division
//input: two numbers from user
//ouptut: quotient and remainder

String str = ""
print "Please enter your first number: "
str = System.console().readLine()
int num1 = Integer.parseInt(str)

print "Please enter your second number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)

int count = 0
int remainder = num1

while(num2 <= remainder){
	remainder = remainder - num2
	count ++
}
print num1 + " divided by " + num2 + " is " + count + ", remainder " + remainder
