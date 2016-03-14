/**
 * 
 */
package switchcase;

import java.util.Scanner;

/**
 * @file MonthendDay.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 해당 월의 말일을 출력함 예를 들면 1월이면 31일 출력
 *
 */
public class MonthendDayMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도,월 입력 :");
		MonthendDay md = new MonthendDay();
		md.getMonthendDay(scanner.nextInt(), scanner.nextInt());
		System.out.println(md);
	}
}
