
/**
 * @encoding UTF-8
 * @author Karbob
 * @data 2020-12-15
 * @description ( NumberFormatExceprion 异常）程序淸单 6 - 8 实现了 hexToDec (String
 *              hexString)方法， 它将一个十六进制宇符串转换为一个十进制数。实现这个 hexToDec 方法，在宇符串不是一个
 *              十六进制字符串时抛出 NumberFormatException 异常。
 */

import java.util.Scanner;

public class SixteenToTen {
	/** Main method */
	public static void main(String[] args) {

		// create Scanner
		Scanner keyboard = new Scanner(System.in);

		System.out.print("输入一个16进制的数: "); // 提示用户输入

		String hexString = keyboard.next();

		// close Scanner
		keyboard.close();

		try {
			int result = hexToDec(hexString.toUpperCase());
			System.out.println(String.format("10进制数为: %d", result));
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @description 将16进制转化为10进制
	 * @param hexString 16进制数
	 * @return result 10进制数
	 */
	public static int hexToDec(String hexString) throws NumberFormatException {

		int result = 0;
		int length = hexString.length(); // 字符串长度

		// 霍纳算法将16进制转化为10进制
		for (int i = 0; i < length; i++) {
			char ch = hexString.charAt(i);
			if (ch >= '0' && ch <= '9') {
				result = result * 16 + (ch - '0');
			} else if (ch >= 'A' && ch <= 'F') {
				result = result * 16 + (ch - 'A' + 10);
			} else {
				throw new NumberFormatException("Invalid input");
			}
		}
		return result;
	}
}
