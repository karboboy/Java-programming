
/**
 * @encoding UTF-8
 * @author Karbob
 * @data 2020-12-15
 * @description ( OutOfMemoryError 错误）编写一个程序，它能导致 JVM 抛出一个 OutOfMemoryError, 然
 *              后捕获和处理这个错误。
 */

import java.util.ArrayList;
import java.util.List;

public class JVM_Error {
	/** Main method */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		try {
			while (true) {
				list.add("hello world");
			}
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}

	}
}