
/*
 * 第三章3.27
 */
import java.util.Scanner;

public class PointExistTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a point's x- and y-coodinates: ");
		double pointX = scan.nextDouble();
		double pointY = scan.nextDouble();
		scan.close();
		if (pointX + 2 * pointY < 200 && pointX > 0 && pointX < 200 && pointY > 0 && pointY < 100) {
			System.out.println("The point is in the triangle");
		} else {
			System.out.println("The point is not in the triangle");
		}
	}

}
