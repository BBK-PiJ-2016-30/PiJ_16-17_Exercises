//More on points

class Point {
	double x;
	double y;


	double distanceTo(Point p){
		//takes point as input
		//returns distance another point

		return Math.sqrt(((this.x - p.x)**2)+((this.y - p.y)**2))
	}
	
	double distanceToOrigin(){
		//calculates distance to origin
		//uses distanceTo

		Point origin = new Point()
		origin.x = 0
		origin.y = 0
		
		return distanceTo(origin)
	}
	
	void moveTo(double x, double y){
		//change point coordinates
		this.x = x
		this.y = y
	}
	
	void moveTo(Point p){
		//changes coordinates to given point
		
		this.x = p.x
		this.y = p.y
	}

	Point clone(){
		//returns copy of current point with the same coordinates
		Point clone = new Point()
		clone.x = this.x
		clone.y = this.y

		return clone
	}
	
	Point opposite(){
		//returns a copy of the current point with the coordinates multiplied by -1
		Point opp = new Point()
		opp.x = this.x*-1
		opp.y = this.y*-1

		return opp
	}

}

println("Setting Points");
Point pointOne = new Point();
pointOne.x = 7;
pointOne.y = 2;
println("pointOne has the following coordinates, x = " + pointOne.x + ", y = " + pointOne.y);

Point pointTwo = new Point();
pointTwo.x = 3;
pointTwo.y = 4;
println("pointTwo has the following coordinates, x = " + pointTwo.x + ", y = " + pointTwo.y);

Point pointThree = new Point();
pointThree.x = 10;
pointThree.y = 12;
println("pointThree has the following coordinates, x = " + pointThree.x + ", y = " + pointThree.y);

println("---------------");
println("Distance");

println("The distance from pointOne to pointTwo is " + pointOne.distanceTo(pointTwo));
println("The distance from pointOne to the origin " + pointOne.distanceToOrigin());

println("---------------");
println("Moving pointOne to new coordinates");

pointOne.moveTo(3,8);
println("pointOne has moved to, x = " + pointOne.x + ", y = " + pointOne.y);

println("---------------");
println("Moving pointOne to pointThree");
pointOne.moveTo(pointThree);
println("The coordinates for pointThree are, x = " + pointThree.x + ", y = " + pointThree.y);
println("pointOne has now been moved to pointThree, pointOne coordinates are now x = " + pointOne.x + ", y = " + pointOne.y + ". The same coordinates as pointThree.");

println("---------------");
println("Cloned point");

clonePoint = pointOne.clone();
println("clonePoint is a copy of pointOne, its coordinates are x = " + clonePoint.x + ", y = " + clonePoint.y);

println("---------------");
println("Opposite point");

oppositePoint = pointOne.opposite();
println("oppositePoint is copy of pointOne with its coordinates multiplied by -1. Its coordinates are x = " + oppositePoint.x + ", y = " + oppositePoint.y);