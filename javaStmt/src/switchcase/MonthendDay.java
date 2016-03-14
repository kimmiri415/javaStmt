/**
 * 
 */
package switchcase;

/**
 * @file MonthendDay.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class MonthendDay {
	private int year, month, endDay;
	private String result;

	public void getMonthendDay(int year, int month) {
		this.year = year;
		this.month = month;
		setEndDay();
	}

	public void setEndDay() {
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			this.endDay = 31;
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			this.endDay = 30;
			break;

		case 2:
			this.endDay = 29;
			break;

		}
	}

	@Override
	public String toString() {
		result = (month >= 1 && month <= 12) ? (year + "년 " + month + "월의 마지막날은 " + endDay + "일입니다.") : "잘못된 값";
		return result;
	}

}
