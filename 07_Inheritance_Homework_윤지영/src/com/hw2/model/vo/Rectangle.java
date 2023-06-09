package com.hw2.model.vo;

public class Rectangle extends Point{
	private double width;
	private double height;
	
	public Rectangle() {
	}
	public Rectangle(int x, int y, double width, double height) {
		super(x,y);
		this.height = height;
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void draw() {
		
	}
}
