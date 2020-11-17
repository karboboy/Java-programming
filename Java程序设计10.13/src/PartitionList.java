
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-10-13
 * @description (划分列表)编写以下方法，使用第一个元素对列表进行划分，该元素称为支点。
 */

import java.util.Scanner;

public class PartitionList {

	public static void main(String[] args) {

		System.out.println("Enter list: "); // 提示输入
		Scanner keyboard = new Scanner(System.in);
		int listCount = keyboard.nextInt(); // 数组的大小
		int[] list = new int[listCount];
		for (int i = 0; i < listCount; i++) {
			list[i] = keyboard.nextInt();// 存储数值进入数组
		}

		keyboard.close(); // 结束读取

		int[] list1 = partition(list);

		System.out.print("After the partition. the list is");
		for (int i : list1) {
			System.out.print(" " + i);
		}
	}

	public static int[] partition(int[] list) {

		int left = 0;
		int right = list.length - 1;
		int temp = list[left];

		while (left < right) {
			// 从右往左走找小于支点的数
			while (left < right && list[right] > temp) {
				right--;
			}
			if (left < right) {
				list[left++] = list[right];
			}

			// 从左往右找大于支点的数
			while (left < right && list[left] < temp) {
				left++;
			}
			if (left < right) {
				list[right--] = list[left];
			}
		}
		list[left] = temp;

		return list;
	}

}
