
/**
 * @encoding UTF-8
 * @author Karbob
 * @data 2020-12-22
 * @description 将文件内容进行复制，然后把文件内容写入到文件中，相当于文件的复制粘贴
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) {

//		fileStreamCopyFile();
		bufferedInputCopyFile();
		System.out.println("文件复制成功！");
	}

	/**
	 * 使用FileStream复制文件
	 */
	public static void fileStreamCopyFile() {

		try {
			// 打开文件
			FileInputStream fileReader = new FileInputStream("e:/input.txt");

			// 新建一个二进制数组
			byte[] bytes = new byte[fileReader.available()];

			// 读取文件
			fileReader.read(bytes);

			// 关闭文件
			fileReader.close();

			// 打开文件
			FileOutputStream fileWriter = new FileOutputStream("e:/output.txt");

			// 将内容写入文件
			fileWriter.write(bytes);

			// 关闭文件
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @description 使用BufferedStream复制文件，文件内容会先保存在缓冲区内
	 *              使用BufferedOutputStream写入文件时候，如果不关闭文件，就不会将内容写入文件，因为关闭文件时候会自动调用BufferedOutputStream中的flush方法，将缓冲区的内容写入文件，
	 *              如果不关闭文件则需要自己手动flush才可以将内容写入文件；读取文件时候同理，close文件的时候，会将缓冲区的内容释放出来
	 */
	public static void bufferedInputCopyFile() {

		try {
			// 打开文件
			BufferedInputStream fileReader = new BufferedInputStream(new FileInputStream("e:/input.txt"));

			// 文件字节数
			int length = fileReader.available();

			// 创建一个二进制数组
			byte[] bytes = new byte[length];

			// 读取文件
			fileReader.read(bytes, 0, length);

			// 关闭文件，将缓冲区的内容释放
			fileReader.close();

			// 打开文件
			BufferedOutputStream fileWriter = new BufferedOutputStream(new FileOutputStream("e:/output.txt"));

			// 写入文件
			fileWriter.write(bytes, 0, length);

//			手动将缓冲区的内容写入文件
//			fileWriter.flush();

			// 关闭文件
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
