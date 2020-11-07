/*
 * 第三章3.22
 */

import java.util.Scanner;

public class PointExistCircle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a point with two coordinates: ");
		double pointX = scan.nextDouble();
		double pointY = scan.nextDouble();
		scan.close();
		if (pointX * pointX + pointY * pointY < 100) {
			System.out.println(String.format("Point (%.1f, %.1f) is in the circle", pointX, pointY));
		} else {
			System.out.println(String.format("Point (%.1f, %.1f) is not in the circle", pointX, pointY));
		}
	}

}
