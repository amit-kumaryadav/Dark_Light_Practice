package com.practce.DesignPattern;

public class FlyWeight_Design_Pattern {
	// Less number of objects reduces the memory usage, and it manages to keep us
	// away from errors related to memory like java.lang.OutOfMemoryError.
	// Although creating an object in Java is really fast, we can still reduce the
	// execution time of our program by sharing objects.
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String args[]) {
		for (int i = 0; i < 20; i++) {
			FlyWeight_Design_Pattern fly = new FlyWeight_Design_Pattern();
			Circle circle = new ShapeFactory().getShape(fly.getColors());
			circle.setRadius(100);
			circle.setX_coordinate(i * 1 + 10);
			circle.setY_coordinate(i * 1 + 20);
			circle.draw();
		}
	}

	public String getColors() {
		return colors[(int) (Math.random() * colors.length)];
	}
}
