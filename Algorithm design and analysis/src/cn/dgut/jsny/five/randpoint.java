package cn.dgut.jsny.five;

import java.util.Scanner;

public class randpoint {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double x_center = sc.nextDouble();
		double y_center = sc.nextDouble();
		System.out.println(randpoint());
	}

	public class Solution {
		private double radius;
		private double x_center;
		private double y_center;

		public Solution(double radius, double x_center, double y_center) {
			this.radius = radius;
			this.x_center = x_center;
			this.y_center = y_center;
		}

		public double[] randpoint() {
			double radRand = this.radius * Math.sqrt(Math.random());
			; // °ë¾¶·¶Î§£º0~this.radius
			double angle = 2 * Math.PI * Math.random(); // Æ«×ª½Ç·¶Î§£º£©~2PI
			return new double[] { radRand * Math.cos(angle) + this.x_center,
					radRand * Math.sin(angle) + this.y_center };
		}
	}
}