
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-3
 * @description 第九章9-3
 */

import java.util.Date;

public class DisplayDate {

	public static void main(String[] args) {

		for (int i = 4; i <= 11; i++) {
			Date date = new Date((long) Math.pow(1, i));
			System.out.println(date.toString());
		}

	}

}
