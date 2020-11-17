
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-3
 * @description 第十一章11-9
 */

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers (input edns with 0): ");
		int value;

		do {
			value = input.nextInt(); // Read a value from the input

			if (!list.contains(value) && value != 0) {
				list.add(value); // Add the value if it is not in the list
			}
		} while (value != 0);

		input.close();

		// Display the distinct numbers
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
