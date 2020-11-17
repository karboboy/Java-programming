
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-10-13
 * @description (冒泡排序）使用冒泡排序算法编写一个排序方法。冒泡排序算法遍历数组几次。在每次遍历
 *              中，对相邻的两个元素进行比较。如果这一对元素是降序，则交换它们的值；否则，保持值不 变。由于较小的值像气泡一样逐渐 “浮向”
 *              顶部，同时较大的值 “沉向” 底部，所以，这种技 术称为冒泡排序法（bubble sort)或下沉排序法（sinking
 *              sort)。编写一个 测试程序，读取 10个double 型的值，调用这个方法，然后显示排好序的数字。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		// 创建一个列表
		List<Double> number = new ArrayList<>();
		String result;

		Scanner keyboard = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			// 读取10个double类型的数字
			number.add(keyboard.nextDouble());
		}

		keyboard.close();

		// 冒泡排序
		for (int i = 0; i < number.size(); i++) {
			for (int j = i + 1; j < number.size(); j++) {
				if (number.get(i) > number.get(j)) {
					double temp = number.get(i);
					number.set(i, number.get(j));
					number.set(j, temp);
				}
			}
		}

		// 去掉列表中的[和,和]
		result = number.toString().replace(",", "").replace("[", "").replace("]", "");
		System.out.println(result);

	}

}
