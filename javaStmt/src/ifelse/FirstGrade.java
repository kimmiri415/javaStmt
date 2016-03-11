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
public class FirstGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3명의 이름과,점수를 입력하세요 :");
		String aName = scanner.next();
		int aScore = scanner.nextInt();
		String bName = scanner.next();
		int bScore = scanner.nextInt();
		String cName = scanner.next();
		int cScore = scanner.nextInt();
		String maxName = "";
		int maxScore = 0;
		
		if (aScore > bScore && aScore > cScore) {
			maxName = aName;
			maxScore = aScore;
		} else if (bScore > aScore && bScore > cScore) {
			maxName = bName;
			maxScore = bScore;
		} else if (cScore > aScore && cScore > bScore) {
			maxName = cName;
			maxScore = cScore;
		}
		System.out.println("1등은 " + maxName + "," + maxScore + "점입니다.");
	}
}
