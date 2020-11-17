
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-10-13
 * @description (是否排好序了?)编写以下方法，如果参数中的 list 数组已经按照升序排好了，则返回 true。
 */

import java.util.Scanner;

public class JudgeSorted {

	public static void main(String[] args) {

		// 定义变量
		int numberCount;

		System.out.println("Enter list: "); // 提示输入

		Scanner keyboard = new Scanner(System.in);
		numberCount = keyboard.nextInt();
		int list[] = new int[numberCount]; // 建立数组
		for (int i = 0; i < numberCount; i++) {
			// 数据存入数组
			list[i] = keyboard.nextInt();
		}

		keyboard.close(); // 结束读入

		if (isSorted(list)) {
			System.out.println("The list is already sorted");
		} else {
			System.out.println("The list is not sorted");
		}

	}

	public static boolean isSorted(int[] list) {
		for (int i = 0; i < list.length; i++) {
			for (int j = i + 1; j < list.length; j++) {
				if (list[i] > list[j]) {
					return false;
				}
			}
		}
		return true;
	}

}
