//Maximising
//input: reads arbitrarily long sequence of positive numbers
//sequence ended when user enters -1
//output: print the highest number

String str = ""

int count = 0
int userEntry = 0
int num = 0
boolean check = true

print "Please enter your first number: "
str = System.console().readLine()
int maxNum = Integer.parseInt(str)
userEntry = count+1

while(check){

	print "Please enter another number: "
	str = System.console().readLine()
	num = Integer.parseInt(str)
	if(num> maxNum){
		maxNum = num
		userEntry = count +1
	}else if(num == -1){
		break;
	}
	count ++
}
print "The highest number you entered was entry number " + userEntry + " which equaled " + maxNum
