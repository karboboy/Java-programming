
/**
 * 第七章7.17
 * description: (对学生排序）编写一个程序，提示用户输入学生个数、学生姓名和他们的成绩，然后按照学生
 * 成绩的降序打印学生的姓名。
 */

import java.util.Scanner;

public class SortToStudents {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the numbers of student: ");

		Struct st[] = new Struct[102];
		int studentNumber = keyboard.nextInt();

		System.out.println("Enter the name and score of students: ");
		for (int i = 0; i < studentNumber; i++) {
			st[i] = new Struct();
			st[i].setName(keyboard.next());
			st[i].setScore(keyboard.nextInt());
		}

		keyboard.close();

		// 对结构体进行排序
		for (int i = 0; i < studentNumber; i++) {
			int max = st[i].getScore();
			int index = i;
			for (int j = i + 1; j < studentNumber; j++) {
				if (max < st[j].getScore()) {
					max = st[j].getScore();
					index = j; // 记住下标
				}
			}
			// 整个结构体进行交换
			Struct temp = new Struct();
			temp = st[i];
			st[i] = st[index];
			st[index] = temp;
		}

		// 输出结果
		for (int i = 0; i < studentNumber; i++) {
			System.out.println(st[i].getScore());
			System.out.println(st[i].getName());
		}
	}

}

class Struct {
	// 创建一个结构体
	private String name;
	private int score;

	public Struct() {
		this.name = "";
		this.score = 0;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}