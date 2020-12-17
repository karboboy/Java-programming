
/**
 * @encoding UTF-8
 * @author LUO
 * @data 2020-12-15
 * @description ( NumberFormatException 异常）编写 bin2Dec(String
 *              binaryString)方法，将一个二进 制宇符串转换为一个十进制数。实现 biWDec
 *              方法，在字符串不是一个二进制宇符串时抛出 NumberFormatException 异常。
 * 
 */

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		// create Scanner
		Scanner keyboard = new Scanner(System.in);

		// 提示输入
		System.out.print("Enter a binary number: ");

		// 读取二进制数
		String binaryString = keyboard.next();

		// 获取结果, 进行异常处理
		try {
			int result = binaryToDecimal(binaryString);
			System.out.println(String.format("The decimal number is %d", result));
		} catch (NumberFormatException e) {
			// 非二进制数, 抛出异常
			System.out.println(e.getMessage());
		}

		// close Scanner
		keyboard.close();
	}

	/**
	 * @description 将二进制转化为十进制
	 * @param binaryString 二进制字符串
	 * @return result 十进制结果
	 */
	public static int binaryToDecimal(String binaryString) {

		int result = 0; // 十进制结果
		int length = binaryString.length(); // 二进制字符串长度

		/* 利用霍纳算法将2进制转化为10进制 */
		for (int i = 0; i < length; i++) {
			char ch = binaryString.charAt(i);
			if (ch >= '0' && ch <= '1') {
				result = result * 2 + ch - '0';
			} else {
				// 非二进制数, 抛出异常
				throw new NumberFormatException("Invalid input");
			}
		}
		return result;
	}

}
