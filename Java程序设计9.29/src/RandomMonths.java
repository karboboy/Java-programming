
/**
 * 第三章3.4
 */
import java.util.Random;

public class RandomMonths {

	public static void main(String[] args) {
		Random random = new Random();
		int i = random.nextInt(12);
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		System.out.println(i + 1);
		System.out.println(months[i]);

	}
}
