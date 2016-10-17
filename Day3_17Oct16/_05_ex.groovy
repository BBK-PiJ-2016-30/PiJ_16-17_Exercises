//rectangle
//input: reads X and Y coordinates of two points
//output: area of triangle where both points are opposite corners

//demo'd during class 17Oct16

class Rectangle{
	Point upLeft;
	Point downRight;
}

class Point{
	double x;
	double y;
}

//1. Get coordinates from user
println("Coordinates increase going up and right")
println("Enter the coordinates for point UP LEFT: ")
String str = System.console().readLine()
double left = Double.parseDouble(str)
str = System.console().readLine()
double up = Double.parseDouble(str)

println("Enter the coordinates for point DOWN RIGHT: ")
str = System.console().readLine()
double right = Double.parseDouble(str)
str = System.console().readLine()
double down = Double.parseDouble(str)

//2. Create points
Point pointUpLeft = new Point()
pointUpLeft.x = left
pointUpLeft.y = up
Point pointDownRight = new Point()
pointDownRight.x = right
pointDownRight.y = down

//3. Create the Rectangle
Rectangle myRectangle = new Rectangle()
myRectangle.upLeft = pointUpLeft
myRectangle.downRight = pointDownRight

//4. Calculate the perimeter and area
double height = myRectangle.upLeft.y - myRectangle.downRight.y 
double width = myRectangle.downRight.x - myRectangle.upLeft.x

double perimeter = 2 * height + 2 * width
double area = height * width

//5. print results
println("The perimeter of this rectangle is " + perimeter)
println("The area of this rectangle is " + area)
