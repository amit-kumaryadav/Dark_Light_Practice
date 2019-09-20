package com.practce.DesignPattern;

public class Circle implements DrawCircle{
private int radius;
private String color;
private int x_coordinate;
private int y_coordinate;

public int getRadius() {
	return radius;
}
public void setRadius(int radius) {
	this.radius = radius;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getX_coordinate() {
	return x_coordinate;
}
public void setX_coordinate(int x_coordinate) {
	this.x_coordinate = x_coordinate;
}
public int getY_coordinate() {
	return y_coordinate;
}
public void setY_coordinate(int y_coordinate) {
	this.y_coordinate = y_coordinate;
}
public void draw() {
	System.out.println("Circle Info :"+"radius :"+radius +" Color : "+color+ " x_coordinate "+x_coordinate+" y_coordinate "+y_coordinate);
}
}
