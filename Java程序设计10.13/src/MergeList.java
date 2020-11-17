
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-10-13
 * @description 合并两个有序列表
 */

import java.util.Scanner;

public class MergeList {

	public static void main(String[] args) {

		// 读入
		System.out.println("Enter list1: "); // 提示输入
		Scanner keyboard = new Scanner(System.in);
		// 定义变量
		int list1Count = keyboard.nextInt();
		int[] list1 = new int[list1Count];
		for (int i = 0; i < list1Count; i++) {
			list1[i] = keyboard.nextInt(); // 数据存入数组
		}
		System.out.println("Enter list2: ");// 提示输入
		// 定义变量
		int list2Count = keyboard.nextInt();
		int[] list2 = new int[list2Count];
		for (int i = 0; i < list2Count; i++) {
			list2[i] = keyboard.nextInt(); // 数据存入数组
		}

		keyboard.close(); // 结束读入

		int[] list = merge(list1, list2); // 获取归并的有序列表
		// 输出
		System.out.print("The merged list is");
		for (int i : list) {
			System.out.print(" " + i);
		}
	}

	public static int[] merge(int[] list1, int[] list2) {
		int[] list = new int[list1.length + list2.length];
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < list.length; i++) {
			if (index1 == list1.length) {
				list[i] = list2[index2++];
				continue;
			}
			if (index2 == list2.length) {
				list[i] = list1[index1++];
				continue;
			}
			if (list1[index1] > list2[index2]) {
				list[i] = list2[index2++];
			} else {
				list[i] = list1[index1++];
			}
		}
		return list;
	}

}
