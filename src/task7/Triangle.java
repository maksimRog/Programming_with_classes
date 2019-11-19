package task7;

public class Triangle {
	private Dot dotA;
	private Dot dotB;
	private Dot dotC;

	public Triangle(Dot dotA, Dot dotB, Dot dotC) {
		super();
		this.dotA = dotA;
		this.dotB = dotB;
		this.dotC = dotC;
	}

	public double countPerimeter() {

		return countSide(dotA, dotB) + countSide(dotB, dotC) + countSide(dotC, dotA);
	}

	public double countSide(Dot a, Dot b) {

		return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
	}

	public double countSquare() {
		double p = countPerimeter() / 2;
		return Math.sqrt(p * (p - countSide(dotA, dotB)) * (p - countSide(dotB, dotC)) * (p - countSide(dotC, dotA)));
	}

	public Dot findMedianDot() {
		int x = (dotA.getX() + dotB.getX() + dotC.getX()) / 3;
		int y = (dotA.getY() + dotB.getY() + dotC.getY()) / 3;
		return new Dot(x, y);
	}
}
