package com.circle;

public class Main {
	public static void main(String[]args) {
		int r=5;
		Circle circle=new Circle(r);
		System.out.println("Radius of the circle is"+r);
		System.out.println("The area of the circle is"+circle.getArea());
		System.out.println("The circumference of the circle is"+circle.getCircumference());
	}

}
