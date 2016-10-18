//distance point to point
//input: reads X and Y coordinates of three points
//output: the closest of the 3

//some variable declarations
String str = ""
def pointList = []

//1. declare class
class Point{
	double x;
	double y;
}

def splitPoints(userString,option){
	int operatorLoc = 0
	operatorLoc = userString.indexOf(",")
	
	if(option == 1){
		return Double.parseDouble(userString[0..operatorLoc-1])
	}else{
		return Double.parseDouble(userString[operatorLoc+1..userString.length()-1])

	}
}



//2. create points

print("Please enter Point 1 in the format - x,y : ");
str = System.console().readLine()
Point newP1 = new Point()
newP1.x = splitPoints(str,1)
newP1.y = splitPoints(str,2)

print("Please enter Point 2 in the format - x,y : ");
str = System.console().readLine()
Point newP2 = new Point()
newP2.x = splitPoints(str,1)
newP2.y = splitPoints(str,2)

print("Please enter Point 3 in the format - x,y : ");
str = System.console().readLine()
Point newP3 = new Point()
newP3.x = splitPoints(str,1)
newP3.y = splitPoints(str,2)


//3. Calculate distance
//point 1 - point 2
double dist1 = Math.sqrt(((newP1.x - newP2.x)**2)+((newP1.y - newP2.y)**2))
pointList.push(dist1)

//point 1 - point 3
double dist2 = Math.sqrt(((newP1.x - newP3.x)**2)+((newP1.y - newP3.y)**2))
pointList.push(dist2)

//point 3 - point 2
double dist3 = Math.sqrt(((newP3.x - newP2.x)**2)+((newP3.y - newP2.y)**2))
pointList.push(dist3)


//4.print closest pair
int minDistIndex = pointList.indexOf(pointList.min())

switch(minDistIndex+1){
	case 1:
		println("Point 1 and Point 2 are closest.")
		break;
	case 2:
		println("Point 1 and Point 3 are closest.")
		break;
	case 3:
		println("Point 2 and Point 3 are closest.")
		break;
	Default:
		println("Crash, ahhhhh!")
		break;
}

