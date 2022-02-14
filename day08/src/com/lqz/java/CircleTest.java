package com.lqz.java;

class Circle{
	double radius;
	public double calArea() {
		double res = Math.PI * radius * radius;
		return res;
	}
}

public class CircleTest {
	public static void main(String[] args) {
			Circle c1 = new Circle();
			c1.radius = 3.3;
			double ans = c1.calArea();
			System.out.println(ans);
	}

}

