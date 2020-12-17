
/**
 * @encoding UTF-8
 * @author Karbob
 * @data 2020-12-8
 * @description 使用链表和映射存放多个图书信息，遍历并输出。其中商品属性：编号，名称，单价，出版社；使用商品编号作为映射中的key。
 */

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BookData {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		List<Map<String, Map<String, String>>> message = new ArrayList<>();

		System.out.print("请问需要存放多少本图书: "); // 提示输入

		/* 输入数据 */
		int bookNumbers = keyboard.nextInt(); // 图书的数量

		for (int i = 0; i < bookNumbers; i++) {
			// 创建一个字典, 存储编号
			Map<String, Map<String, String>> number = new TreeMap<>();

			// 创建一个字典, 存储数据
			Map<String, String> data = new LinkedHashMap<>();

			// 把图书编号放进字典
			System.out.print("请输入图书的编号: "); // 提示输入
			data.put("编号", keyboard.next());

			// 把图书名称放进字典
			System.out.print("请输入图书的名称: "); // 提示输入
			data.put("名称", keyboard.next());

			// 把图书单价放进字典
			System.out.print("请输入图书的单价: "); // 提示输入
			data.put("单价", keyboard.next());

			// 把图书出版社放进字典
			System.out.print("请输入图书的出版社: "); // 提示输入
			data.put("出版社", keyboard.next());

			// 把编号和数据放进字典里
			number.put(data.get("编号"), data);

			// 把数据放进列表
			message.add(number);

			System.out.println("");
		}

//		System.out.println(message);

		keyboard.close();

		/* 遍历图书的信息 */
		for (Map<String, Map<String, String>> map : message) {
			for (Map<String, String> data : map.values()) {
				System.out.println("*******************");
				for (Map.Entry<String, String> entry : data.entrySet()) {
					System.out.println(String.format("%s : %s", entry.getKey(), entry.getValue()));
				}
			}
		}
	}

}