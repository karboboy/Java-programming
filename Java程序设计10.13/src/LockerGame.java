
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-10-13
 * @description (游戏：储物柜难題)一个学校有丨00 个储物柜和 100 个学生。所有的储
 *              物柜在上学第一天都是关着的。随着学生进来，第一个学生（用 S1表示） 打开每个柜子。然后，第二个学生（用 S2
 *              表示）从第二个柜子（用 L2 表 示）开始. 关闭相隔为1的柜子。学生 S3 从第三个柜子开始，然后改变每个第三个柜子（如果
 *              它是开的就关上，如果它是关的就打开）。学生 S4 从柜子 L4 开始，然后改变每个第四个柜子 的开闭状态。学生 S5从 L5
 *              开始，然后改变每个第五个柜子的状态，依此类推，直到学生 S100 改变 L100 为止。
 */

public class LockerGame {

	public static void main(String[] args) {

		// 定义变量
		boolean isOpenLockers[] = new boolean[100];

		// 第一个学生使每个储物柜都打开
		for (int i = 0; i < 100; i++) {
			isOpenLockers[i] = true;
		}

		// 从第二个学生开始, 开始开关储物柜
		for (int i = 1; i < 100; i++) {
			for (int j = i; j < 100; j += (i + 1)) {
				// 储物柜开了, 把它关了, 储物柜关了, 把它开了
				isOpenLockers[j] = !isOpenLockers[j];
			}
		}

		// 输出哪个箱子是打开的
		for (int i = 0; i < 100; i++) {
			if (isOpenLockers[i]) {
				System.out.println(i + 1);
			}
		}
	}

}
