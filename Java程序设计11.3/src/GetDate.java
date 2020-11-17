
/**
 * @coding UTF-8
 * @author LUO
 * @date 2020-11-3
 * @description 第九章9-3
 */

import java.util.GregorianCalendar;

public class GetDate {

	public static void main(String[] args) {
		// 显示当前时间
		GregorianCalendar year = new GregorianCalendar();
		GregorianCalendar month = new GregorianCalendar();
		GregorianCalendar day = new GregorianCalendar();
		System.out.println(String.format("%d-%d-%d", year.get(GregorianCalendar.YEAR),
				month.get(GregorianCalendar.MONTH) + 1, day.get(GregorianCalendar.DAY_OF_MONTH)));

		// 显示特定时间
		long timeInMillis = 123456789765L;
		year.setTimeInMillis(timeInMillis);
		month.setTimeInMillis(timeInMillis);
		day.setTimeInMillis(timeInMillis);
		System.out.println(String.format("%d-%d-%d", year.get(GregorianCalendar.YEAR),
				month.get(GregorianCalendar.MONTH) + 1, day.get(GregorianCalendar.DAY_OF_MONTH)));
	}

}
