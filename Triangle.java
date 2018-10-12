public class Triangle{
	private Point v1;
	private Point v2;
	private Point v3;


	public Triangle(Point v1, Point v2, Point v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}

	public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) { 
		v1 = new Point(x1, y1);	
		v2 = new Point(x2, y2);
		v3 = new Point(x3, y3);
	}

	public double getPerimeter() {
		return ( v1.distanceTo(v2) + Point.distance(v2,v3) + v3.distanceTo(v1) );
	}
	
	public Point getVertex(int index) {
		Point[] points = {v1, v2, v3};
		Point answer = new Point(points[index]);
		return answer;
	}

	public void setVertex(int index, Point newP) {
		Point[] points = {v1, v2, v3};
		points[index] = new Point(newP);
		v1 = points[0];
		v2 = points[1];
		v3 = points[2];
	}

	public String toString() {
		return ("Triangle: A - (" + v1 + ") | B - (" + v2 + ") | C - (" + v3 + ")");
	}
}
