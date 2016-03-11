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
public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력해주세요 :");
		int inputSec = scanner.nextInt(), hour = 0, min = 0, sec = 0, remain = 0;
		hour = inputSec / 3600;
		remain = inputSec % 3600;
		min = remain / 60;
		sec = remain % 60;
		
		System.out.println(inputSec + "초는 " + hour + "시간" + min + "분" + sec + "초 입니다.");
	}

}
