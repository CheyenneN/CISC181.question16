
public class Triangle extends GeometricObject {
	public double side1, side2, side3;
		public Triangle() {
	super(); //usually done implicitly
	this.side1 = 1.0;
	this.side2 = 1.0;
	this.side3 = 1.0;
	}

	public Triangle(String color, boolean fill, double s1, double s2, double s3) {
	super(); //usually done implicitly
	this.setColor(color);
	this.setFilled(fill);
	this.side1 = s1;
	this.side2 = s2;
	this.side3 = s3;
	}


	public double getSide(int side) throws IllegalArgumentException {

	switch(side) {
	case 1:
	return this.side1;

	case 2:
	return this.side2;
	
	case 3:
	return this.side3;
	
	default:
	throw new IllegalArgumentException("Arguments accepted: 1, 2, or 3");
	}
	}
	
	public double getArea() {
	double s = (this.side1 + this.side2 + this.side3) / 2;
	return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
	}
	
	public double getPerimeter() {
	return this.side1 + this.side2 + this.side3;
	}

	public String toString() {
	String state = "Triangle. " + super.toString();
	state += "\nSide 1" + this.side1;
	state += "\nSide 2" + this.side2;
	state += "\nSide 3" + this.side3;
	return state;
	}
}


