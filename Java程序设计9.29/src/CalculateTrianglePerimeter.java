
/*
 * 第三章3.19
 */
import java.util.Arrays;
import java.util.Scanner;

public class CalculateTrianglePerimeter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] side = new int[3];
		for (int i = 0; i < 3; ++i) {
			side[i] = scan.nextInt();
			if (side[i] < 0) {
				System.out.println("Invalid！");
				scan.close();
				return;
			}
		}
		scan.close();
		Arrays.sort(side);
		if (side[0] + side[1] > side[2]) {
			System.out.println(side[0] + side[1] + side[2]);
		} else {
			System.out.println("Invalid!");
		}
	}

}
