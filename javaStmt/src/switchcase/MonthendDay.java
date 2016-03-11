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
public class MonthendDay {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도,월 입력 :");
		int year =scanner.nextInt(),month = scanner.nextInt(), endDay = 0;
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:
		case 12:endDay = 31;break;

		case 4:case 6:case 9:
		case 11:endDay = 30;break;

		case 2:endDay = 29;break;

		default:
			System.out.println("잘못된 값");
			return;
		}
		System.out.println(year+"년"+month + "의 마지막날은 " + endDay + "일입니다.");
	}
}
