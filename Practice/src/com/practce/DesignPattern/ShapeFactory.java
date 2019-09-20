package com.practce.DesignPattern;

import java.util.HashMap;

public class ShapeFactory {
	private static final HashMap<String, Circle> circleClassContainer = new HashMap<>();

	public Circle getShape(String color) {
		if (circleClassContainer.getOrDefault(color, null) == null ? true : false) {
			System.out.println("new Circle Object created with "+color+" Color");
			Circle circle = new Circle();
			circle.setColor(color);
			circleClassContainer.put(color, circle);
			return circle;
		}
		return circleClassContainer.get(color);
	}
}