import java.util.Scanner;

/*
 * 第三章3.9
 */
public class CheckISBN_10 {

	public static void main(String[] args) {
		System.out.println("Enter the first 9 digits of an integer:");
		Scanner input = new Scanner(System.in);
		String strNumber = input.next();
		String oldNumber = new String(strNumber);
		int result = 0;
		int index = 0;
		input.close();
		char[] number = strNumber.toCharArray();
		for (int i : number) {
			result += (i - '0') * (index + 1);
			index += 1;
		}
		result = result % 11;
		oldNumber += result == 10 ? 'X' : String.valueOf(result);
		System.out.println(oldNumber);
	}

}
