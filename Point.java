public class Point{
	private double x;
	private double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double distanceTo(Point toP) {
		return Math.sqrt( Math.pow(toP.x - x , 2) + Math.pow(toP.y - y , 2) );
	}

	public double distance(Point froP, Point toP) {
		return Math.sqrt( Math.pow(toP.x - froP.x , 2) + Math.pow(toP.y - froP.y , 2) );
	}

	public String toString() {
		return (x + ", " + y);
	}
}
