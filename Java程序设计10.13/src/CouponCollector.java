
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-10-13
 * @description (仿真：优惠券收集人网題)优惠券收集人问题是一个经典的统计问题，它有很多实际应用。这
 *              个问题重复地从一套对象中拿出一个对象，然后找出要将所有需要拿出的对象都至少拿出来一
 *              次，需要拿多少次。从该问题衍生出的类似问题就是，从一副打乱的 52 张牌中重复选牌，找出
 *              在看到每种花色都有一张出现前，需要选多少次。假设在选下一张牌之前的那张牌是背面向上
 *              的。编写程序，模拟要得到四张不同花色的牌所需要的选取次数，然后显示选中的四张牌（有 可能一张牌被选了两次）。
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CouponCollector {

	public static void main(String[] args) {

		// 初始化变量
		String[] numbers = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String[] colors = { "Clubs", "Diamonds", "Hearts", "Spades" };
		Random random = new Random();
		List<String> list = new ArrayList<>();
		int count = 0;

		while (list.size() != colors.length) {
			String number = numbers[random.nextInt(numbers.length)]; // 随机数字
			String color = colors[random.nextInt(colors.length)]; // 随机花色
			if (!list.contains(color)) {
				list.add(color);
				System.out.println(String.format("%s of %s", number, color));
			}
			++count;
		}
		System.out.printf("Number of picks: %d", count);
	}

}
