package org.msharma.noviceproblems.simpleprograms;

import java.util.Scanner;

/**
 * This Example demonstrates the Use of PI to find the area of Circle in Java
 */
class CircleArea
{
	public static void main(String arr[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		int radius = in.nextInt();
		double area = Math.PI*radius*radius;
		System.out.println("Area of the circle is " + area);
	}
}