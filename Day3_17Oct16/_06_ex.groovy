//inside or outside
//input: reads X and Y coordinates of two points defining a rectangle then the coordinates of a third point
//output: whether the point is inside or outside the rectangle

//some variable declarations
String str = ""
def pointList = []

//1. declare classes
class Point{
	double x;
	double y;
}

class Rectangle{
	Point topLeft;
	Point bottomRight;
}


//declare some user functions
def splitPoints(userString,option,delimiter){
	int operatorLoc = 0
	operatorLoc = userString.indexOf(delimiter)
	
	if(option == 1){
		return Double.parseDouble(userString[0..operatorLoc-1])
	}else{
		return Double.parseDouble(userString[operatorLoc+1..userString.length()-1])

	}
}

//2. create points
println("You will enter the points for the Rectangle first, \nfollowed by the point to be checked.")
print("Please enter the TOP LEFT point of the rectangle in the format - x,y : ");
str = System.console().readLine()
Point newP1 = new Point()
newP1.x = splitPoints(str,1,",")
newP1.y = splitPoints(str,2,",")

print("Please enter the BOTTOM RIGHT point of the rectangle in the format - x,y : ");
str = System.console().readLine()
Point newP2 = new Point()
newP2.x = splitPoints(str,1,",")
newP2.y = splitPoints(str,2,",")

print("Please enter the point you'd like to check the location of in the format - x,y : ");
str = System.console().readLine()
Point newP3 = new Point()
print str
newP3.x = splitPoints(str,1,",")
newP3.y = splitPoints(str,2,",")

//3. create rectangle
Rectangle rectangleCheck = new Rectangle()
rectangleCheck.topLeft = newP1
rectangleCheck.bottomRight = newP2


//4. check if point is in rectangle
if(newP3.x > rectangleCheck.topLeft.x & newP3.x < rectangleCheck.bottomRight.x &
	newP3.y < rectangleCheck.topLeft.y & newP3.y > rectangleCheck.bottomRight.y){
	println("Point is in the rectangle.")
}else{
	println("Point isn't in the rectangle.")
}


