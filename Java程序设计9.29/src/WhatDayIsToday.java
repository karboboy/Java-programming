/*
 * 第三章3.21
 */

import java.util.Scanner;

public class WhatDayIsToday {

	public static void main(String[] args) {
		String[] day = { "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter year: (e.g., 2012): ");
		int year = scan.nextInt();
		System.out.println("Enter month: 1-12: ");
		int month = scan.nextInt();
		System.out.println("Enter the day of the month: 1-31: ");
		int q = scan.nextInt();
		int h;
		scan.close();
		if (month == 1 || month == 2) {
			month += 12;
			year -= 1;
		}
		h = (q + (int) (26 * (month + 1) / 10) + year % 100 + (int) (year % 100 / 4) + (int) (year / 400)
				+ (int) (5 * year / 100)) % 7;
		System.out.println(String.format("Day of the week is %s", day[h]));
	}

}
