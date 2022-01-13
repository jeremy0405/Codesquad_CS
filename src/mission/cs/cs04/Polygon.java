package mission.cs.cs04;

import java.util.List;

public class Polygon implements Shape {

	private final List<Point> points;

	public Polygon(List<Point> points) {
		this.points = points;
	}

	@Override
	public double getResult() {
		return 0;
	}

	@Override
	public String getMessage() {
		return points.size() + "각형 넓이";
	}

	@Override
	public List<Point> getPoints() {
		return points;
	}

}