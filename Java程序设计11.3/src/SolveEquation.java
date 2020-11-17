
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-3
 * @description 第九章9-11
 */

import java.util.Scanner;

public class SolveEquation {

	public static void main(String[] args) {
		// 输入
		Scanner keyboard = new Scanner(System.in);
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		double d = keyboard.nextDouble();
		double e = keyboard.nextDouble();
		double f = keyboard.nextDouble();
		keyboard.close();

		LinearEquation equation = new LinearEquation();
		if (equation.isSolvable(a, b, c, d) == true) {
			System.out.println(
					String.format("X:%.2f Y:%.2f", equation.getX(a, b, c, d, e, f), equation.getY(a, b, c, d, e, f)));
		} else {
			System.out.println("The equation has no solution.");
		}
	}

}

class LinearEquation {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquation() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
		this.d = 0;
		this.e = 0;
		this.f = 0;
	}

	public LinearEquation(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
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

	public double getD() {
		return this.d;
	}

	public double getE() {
		return this.e;
	}

	public double getF() {
		return this.f;
	}

	public boolean isSolvable(double a, double b, double c, double d) {
		if (a * d - b * c != 0) {
			return true;
		} else {
			return false;
		}
	}

	public double getX(double a, double b, double c, double d, double e, double f) {
		return (e * d - b * f) / (a * d - b * c);
	}

	public double getY(double a, double b, double c, double d, double e, double f) {
		return (a * f - e * c) / (a * d - b * c);
	}

}
