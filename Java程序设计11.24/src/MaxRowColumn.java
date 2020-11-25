
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-24
 * @description 第十一章11-9
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MaxRowColumn {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random random = new Random(); // 用于随机生成0或1
		System.out.println("Enter the array size n: ");
		int arraySize = keyboard.nextInt(); // 读入数组大小
		keyboard.close();

		int[][] array = new int[arraySize][arraySize]; // 创建n行*n列的矩阵
		List<Integer> list = new ArrayList<>();

		// 随机将0或1填入矩阵
		System.out.println("The random array is");
		for (int i = 0; i < arraySize; i++) {
			for (int j = 0; j < arraySize; j++) {
				array[i][j] = random.nextInt(2);
				System.out.print(array[i][j]);
			}
			System.out.println("");
		}

		// 查找1最多的行
		int maxRow = 0;
		for (int i = 0; i < arraySize; i++) {
			int count = 0;
			for (int j = 0; j < arraySize; j++) {
				if (array[i][j] == 1) {
					++count;
				}
			}
			if (maxRow < count) {
				maxRow = count;
			}
			list.add(count);
		}

		// 输出1最多的行
		System.out.print("The largest row index:");
		for (int i = 0; i < arraySize; i++) {
			if (list.get(i).equals(maxRow)) {
				System.out.print(" " + i);
			}
		}

		list.clear(); // 清除数组

		// 查找1最多的列
		int maxColumn = 0;
		for (int i = 0; i < arraySize; i++) {
			int count = 0;
			for (int j = 0; j < arraySize; j++) {
				if (array[j][i] == 1) {
					++count;
				}
			}
			if (maxColumn < count) {
				maxColumn = count;
			}
			list.add(count);
		}

		// 输出1最多的列
		System.out.print("\nThe largest column index:");
		for (int i = 0; i < arraySize; i++) {
			if (list.get(i).equals(maxColumn)) {
				System.out.print(" " + i);
			}
		}

	}

}
