
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-3
 * @description 第九章9-4
 */

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random random = new Random(1000);
		for (int i = 0; i < 50; i++) {
			System.out.println(random.nextInt(100));
		}

	}

}
