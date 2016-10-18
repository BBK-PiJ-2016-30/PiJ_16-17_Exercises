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
print("Please enter the TOP LEFT point of the first rectangle in the format - x,y : ");
str = System.console().readLine()
Point newP1 = new Point()
newP1.x = splitPoints(str,1,",")
newP1.y = splitPoints(str,2,",")

print("Please enter the BOTTOM RIGHT point of the first rectangle in the format - x,y : ");
str = System.console().readLine()
Point newP2 = new Point()
newP2.x = splitPoints(str,1,",")
newP2.y = splitPoints(str,2,",")

print("Please enter the TOP LEFT point of the second rectangle in the format - x,y : ");
str = System.console().readLine()
Point newP3 = new Point()
newP3.x = splitPoints(str,1,",")
newP3.y = splitPoints(str,2,",")

print("Please enter the BOTTOM RIGHT point of the second rectangle in the format - x,y : ");
str = System.console().readLine()
Point newP4 = new Point()
newP4.x = splitPoints(str,1,",")
newP4.y = splitPoints(str,2,",")

print("Please enter the point you'd like to check the location of in the format - x,y : ");
str = System.console().readLine()
Point newP5 = new Point()
newP5.x = splitPoints(str,1,",")
newP5.y = splitPoints(str,2,",")

//3. create rectangles
Rectangle rectangleCheck1 = new Rectangle()
rectangleCheck1.topLeft = newP1
rectangleCheck1.bottomRight = newP2

Rectangle rectangleCheck2 = new Rectangle()
rectangleCheck2.topLeft = newP3
rectangleCheck2.bottomRight = newP4

//4. check if point is in rectangles
boolean inRec1 = false
boolean inRec2 = false
if(newP5.x > rectangleCheck1.topLeft.x & newP5.x < rectangleCheck1.bottomRight.x &
	newP5.y < rectangleCheck1.topLeft.y & newP5.y > rectangleCheck1.bottomRight.y){
	inRec1 = true
}
if(newP5.x > rectangleCheck2.topLeft.x & newP5.x < rectangleCheck2.bottomRight.x &
	newP5.y < rectangleCheck2.topLeft.y & newP5.y > rectangleCheck2.bottomRight.y){
	inRec2 = true
}

if(inRec1 & inRec1){
	println("In both rectangles.")
}else if(inRec1){
	println("In rectangle 1 only.")
}else if(inRec2){
	println("In rectangle 2 only.")
}else{
	println("Not in any rectangle.")
}



