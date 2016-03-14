/**
 * 
 */
package ifelse;

import java.util.Scanner;

/**
 * @file TimeCalc.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 초를 입력하면 시간, 분, 초를 출력하는 프로그램 1000초를 입력하면 7시간 47분 13초로 출력
 *
 */
public class TimeCalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력해주세요 :");
		TimeCalc tc = new TimeCalc();
		tc.getTimeCalc(scanner.nextInt());
		System.out.println(tc);

	}

}
