
/**
 * @encoding UTF-8
 * @author Karbob
 * @data 2020-12-15
 * @description ( HexFormatException 异常）编程练习题 12.6 实现 hex2Dec 方法，在字符串不是一个十六进
 *              制字符串时抛出 NumberFormatException 异常。定义一个名为 HexFormatException的自定
 *              义异常。实现 hex2Dec 方法，在字符串不是一个十六进制字符串时抛出 HexFormatException 异常。
 */

import java.util.Scanner;

public class HexadecimalToDecimal {
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
		} catch (HexFormatException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @description 将16进制转化为10进制
	 * @param hexString 16进制数
	 * @return result 10进制数
	 * @throws HexFormatException
	 */
	public static int hexToDec(String hexString) throws HexFormatException {

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
				throw new HexFormatException("Invalid input");
			}
		}
		return result;
	}
}

/** 自定义HexFormatException类 */
class HexFormatException extends Exception {

	private static final long serialVersionUID = 1L;
	private String hexSring;

	public HexFormatException(String hexString) {
		this.hexSring = hexString;
	}

	@Override
	public String getMessage() {
		return this.hexSring;
	}

}