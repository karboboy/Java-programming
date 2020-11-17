
/*
 * 第七章7.5
 * description: (计算数字的出现次數）编写程序，读取在1到 100 之间的整数，然后计算每个数出现的次数。
 * 假定输入是以 0 结束的。
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountNumber {

	public static void main(String[] args) {
		System.out.println("Enter the integers between 1 and 100: ");
		Scanner keyboard = new Scanner(System.in);

		int count = 1;
		Integer number;
		List<Integer> list = new ArrayList<Integer>(); // 创建空列表
		while (keyboard.hasNextInt()) {
			number = keyboard.nextInt(); // 读取一个数字
			if (number.equals(0)) {
				keyboard.close();
				break; // number=0时候结束读入
			}
			list.add(number); // 增加元素到列表
		}
		Collections.sort(list); // 对列表进行排序
		list.add(-1); // 设置最后一个元素为-1

//		System.out.println(list);	// 输出列表, 用于debug
		for (int i = 0; i < list.size() - 1; ++i) {
			if (list.get(i).equals(list.get(i + 1))) {
				++count;
			} else {
				if (count == 1) {
					System.out.println(String.format("%d occurs %d time", list.get(i), count));
				} else {
					System.out.println(String.format("%d occurs %d times", list.get(i), count));
				}
				count = 1; // 输出后，count初始化为1
			}
		}

	}

}
