/*
 * 第七章7.5
 * description: (打印不同的教）编写一个程序，读人 10 个数并且显示互不相同的数（即一个数出现多次，但仅
 * 显示一次）。（提示，读人一个数，如果它是一个新数，则将它存储在数组中。如果该数已经在数
 * 组中，则忽略它。）输入之后，数组包含的都是不同的数。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");
		Integer number;
		String result;
		Scanner keyboard = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>(); // 创建列表
		for (int i = 0; i < 10; ++i) {
			number = keyboard.nextInt();
			if (list.contains(number) == false) {
				list.add(number); // 如果元素不存在，则增加到列表中
			}
		}
		keyboard.close();
		result = list.toString().replace("[", "").replace("]", "").replace(",", "");
		System.out.println(String.format("The number of distinct number is %d", list.size()));
		System.out.println(String.format("The distinct numbers are: %s", result));
	}

}
