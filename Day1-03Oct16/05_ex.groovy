String str = ""
print "Please enter your first number: "
str = System.console().readLine()
int num1 = Integer.parseInt(str)
print "Please enter your second number: "
str = System.console().readLine()
int num2 = Integer.parseInt(str)
int count = 0
int total = 0
while(count < num2){
	total = total + num1
	count ++
}
print total