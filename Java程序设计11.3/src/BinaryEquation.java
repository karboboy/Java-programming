
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-3
 * @description 第九章9-10
 */

import java.util.Scanner;

public class BinaryEquation {

	public static void main(String[] args) {
		// 输入
		Scanner keyboard = new Scanner(System.in);
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		keyboard.close();

		// 调用类
		QuadraticEquation equation = new QuadraticEquation();
		if (equation.getDiscriminant(a, b, c) > 0) {
			// 存在两个根
			System.out.println(String.format("%.2f %.2f", equation.getRoot1(a, b, c), equation.getRoot2(a, b, c)));
		} else if (equation.getDiscriminant(a, b, c) == 0) {
			// 存在一个根
			System.out.println(String.format("%.2f", equation.getRoot1(a, b, c)));
		} else {
			// 没有根
			System.out.println("The equation has no roots.");
		}
	}

}

class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation() {
		this.a = 1;
		this.b = 1;
		this.c = 1;
	}

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return this.a;
	}

	public double getB() {
		return this.b;
	}

	public double getC() {
		return this.c;
	}

	public double getDiscriminant(double a, double b, double c) {
		return b * b - 4 * a * c;
	}

	public double getRoot1(double a, double b, double c) {
		if (getDiscriminant(a, b, c) >= 0) {
			return (-b + Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
		} else {
			return 0;
		}
	}

	public double getRoot2(double a, double b, double c) {
		if (getDiscriminant(a, b, c) >= 0) {
			return (-b - Math.sqrt(getDiscriminant(a, b, c))) / 2 * a;
		} else {
			return 0;
		}
	}
}