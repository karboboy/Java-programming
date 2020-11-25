
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-24
 * @description 第十一章11-13
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveSameElement {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<>(); // 创建一个列表

		// 读取10个整数到列表
		System.out.println("Enter ten integers:");
		for (int i = 0; i < 10; i++) {
			list.add(keyboard.nextInt());
		}
		keyboard.close();

		// 去除重复元素
		removeDuplicate(list);
	}

	public static void removeDuplicate(ArrayList<Integer> list) {

		List<Integer> set = new ArrayList<>();

		// 输出非重复元素
		System.out.print("The distinct integers are");
		for (int i = 0; i < list.size(); i++) {
			if (!set.contains(list.get(i))) {
				set.add(list.get(i));
				System.out.print(" " + list.get(i));
			}
		}

	}

}
