
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-24
 * @description 第十一章11-15
 */

import java.util.Scanner;

public class ConcavePolygonArea {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		// 输入点的个数
		System.out.println("Enter the number of the points: ");
		int pointNumber = keyboard.nextInt();

		double[] x = new double[pointNumber];// 创建用来存储坐标的数组
		double[] y = new double[pointNumber];

		// 输入点的坐标
		System.out.println("Enter the coordiates of the points:");
		for (int i = 0; i < pointNumber; i++) {
			x[i] = keyboard.nextDouble();
			y[i] = keyboard.nextDouble();
		}
		keyboard.close();

		// 计算面积
		double area = 0;
		for (int i = 0; i < pointNumber; i++) {
			area += computeModule(x[i], y[i], x[(i + 1) % pointNumber], y[(i + 1) % pointNumber]);
		}
		System.out.println(String.format("The total area is %.3f", -area/2));
	}

	public static double computeModule(double a, double b, double c, double d) {
		return a * d - b * c;
	}

}
