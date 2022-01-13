package mission.cs.cs04;

import java.util.List;

public class Triangle implements Shape {

	private final List<Point> points;

	public Triangle(List<Point> points) {
		this.points = points;
	}

	@Override
	public double getResult() {
		return Calculator.calculateArea(points);
	}

	@Override
	public String getMessage() {
		return "삼각형 넓이";
	}

	@Override
	public List<Point> getPoints() {
		return points;
	}

}
