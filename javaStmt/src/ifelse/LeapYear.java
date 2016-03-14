/**
 * 
 */
package ifelse;

/**
 * @file LeapYear.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class LeapYear {
	private int year;
	private String yearStr;

	public void setYearStr(int year) {
		this.year = year;
		this.yearStr = (year % 4 == 0)
				? (yearStr = (year % 100 == 0) ? (yearStr = (year % 400 == 0) ? "윤년" : "평년") : "윤년") : "평년";
	}

	@Override
	public String toString() {
		return "결과  : " + year + "년은 " + yearStr + "입니다.";
	}

}
