
/**
 * @encoding UTF-8
 * @author Karbob
 * @data 2020-12-8
 * @description 由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；将输入的学生信息分别封装到一个Student对象中，再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；最后遍历集合，将集合中学生信息写入到记事本，每个学生数据占单独一行。
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class StudentMessage {
	/** Main method */
	public static void main(String[] args) {

		// create Scanner
		Scanner keyboard = new Scanner(System.in);

		// 创建一个集合, 存储Student对象
		Set<Student> message = new TreeSet<Student>();

		while (true) {
			// 创建一个对象, 存储学生信息
			Student data = new Student();

			/* 学号不为exit时候, 将学号存储到对象中 */
			System.out.print("请输入学号(输入exit退出): ");
			String number = keyboard.next();
			if (number.equals("exit")) {
				break;
			} else {
				data.setNumber(number);
			}

			/* 将姓名存储到对象中 */
			System.out.print("请输入姓名: ");
			data.setName(keyboard.next());

			/* 将年龄信息存储到对象中 */
			System.out.print("请输入年龄: ");
			data.setAge(keyboard.nextInt());

			// 将学生信息存储到集合
			message.add(data);
		}

		// close Scanner
		keyboard.close();

		// 写入文件
		try {
			FileOutputStream fileWriter = new FileOutputStream("./output.txt");
			fileWriter.write("\t学号\t姓名\t年龄\n".getBytes());
			for (Student data : message) {
				fileWriter.write(("\t" + data.getNumber()).getBytes());
				fileWriter.write(("\t" + data.getName()).getBytes());
				fileWriter.write(("\t" + String.valueOf(data.getAge()) + "\n").getBytes());
			}
			// 关闭文件
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

/** Student 类 */
class Student implements Comparable<Student> {

	private String number;
	private String name;
	private int age;

	// 构造方法
	public Student() {
		/* 初始化数据 */
		this.number = "";
		this.name = "";
		this.age = 0;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		if (this.number.equals(o.getNumber())) {
			return -1;
		}
		return this.age - o.getAge();
	}

}
