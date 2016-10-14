//looks for consecutive serious of numbers that are increasing
String str = ""

int lastNum = 0
int curNum = 0
int count = 0

boolean check = false

print "Please enter your first number: "
str = System.console().readLine()
lastNum = Integer.parseInt(str)

while(curNum != -1){

	print "Please enter another number: "
	str = System.console().readLine()
	curNum = Integer.parseInt(str)
	if(curNum == -1){
		break;
	}else if(curNum == (lastNum+1)){
		check = true
		lastNum = curNum
	}else{

		check = false
		lastNum = curNum
	}
	count ++
}

if(count == 0){
	print "No number entered"
}else if (check){	
	print "Yes"
}else{
	print "No"
}