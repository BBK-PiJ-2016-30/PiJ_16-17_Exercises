//Naive sorting
//input: reads 3 number from user
//output: prints them in order form lowest to highest

String str = ""
int count = 0
def numList = []
def numReqList = ["first","second","third"]

while(count <3){
	print("Please enter your " + numReqList[count] + " number: ")
	str = System.console().readLine()
	numList << Integer.parseInt(str)
	count ++
}

numList.sort()
numList.each{
	println("${it}")
}
