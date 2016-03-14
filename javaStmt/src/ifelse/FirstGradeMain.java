package ifelse;

import java.util.Scanner;

/**
 * 
 */

/**
 * @file FirstGrade.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 3명의 학생 점수를 받아서 1등을 출력하는 프로그램
 *
 */
public class FirstGradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 이름과,점수를 입력하세요 :");

		FirstGrade fg = new FirstGrade();
		fg.setMax(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next(),
				scanner.nextInt());
		System.out.println(fg);
	}
}
