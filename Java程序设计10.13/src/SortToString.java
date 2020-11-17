
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-10-13
 * @description 对字符串中的字符进行排序
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortToString {

	public static void main(String[] args) {
		// 读取数据
		Scanner keyboard = new Scanner(System.in);
		String s = keyboard.next();
		keyboard.close();// 结束读入

		System.out.println(sort(s));
	}

	public static String sort(String s) {
		String[] st = s.split(""); // 转化为数组
		s = "";
		Arrays.sort(st); // 排序
		for (String i : st) {
			s += i;
		}

		return s;
	}

}
