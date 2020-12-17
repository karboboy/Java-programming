import java.util.Scanner;

/**
 * @encoding UTF-8
 * @author Karbob
 * @data 2020-12-15
 * @description (BinaryFormatException 异常）编程练习题 12.7 实现 bin2Dec 方法，在字符串不是一个二进制
 *              字符串时抛出 BinaryFormatException异常。定义一个名为 BianryFormatException 的自定
 *              义异常。实现 bin2Dec 方法，在字符串不是一个二进制字符串时抛出 BinaryFormatException 异常。
 * 
 */

public class BinaryToDecimal_1 {
	/** Main method */
	public static void main(String[] args) {

		// create Scanner
		Scanner keyboard = new Scanner(System.in);

		// 提示输入
		System.out.print("Enter a binary number: ");

		// 读取二进制数
		String binaryString = keyboard.next();

		// close Scanner
		keyboard.close();

		// 获取结果, 进行异常处理
		try {
			int result = binaryToDecimal(binaryString);
			System.out.println(String.format("The decimal number is %d", result));
		} catch (BinaryFormatException e) {
			// 非二进制数, 抛出异常
			System.out.println(e.getMessage());
		}
	}

	/**
	 * @description 将二进制转化为十进制
	 * @param binaryString 二进制字符串
	 * @return result 十进制结果
	 */
	public static int binaryToDecimal(String binaryString) throws BinaryFormatException {

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

class BinaryFormatException extends Exception {

	private static final long serialVersionUID = -2877179156421097809L;
	private String binaryString;

	public BinaryFormatException(String binaryString) {
		this.binaryString = binaryString;
	}

	@Override
	public String getMessage() {
		return this.binaryString;
	}

}
