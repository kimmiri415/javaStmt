/**
 * 
 */
package ifelse;

import java.util.Scanner;

/**
 * @file GradeReport.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 성적표(점수에 따라라 A~F까지 학점부여) [결과] ********************* 이름 과목 점수 학점
 *        --------------------- 홍길동 영어 89점 B ********************* 90점이상 A 80점이상
 *        B 70점이상 C 60점이상 D 50점이상 E 50점미만 F 만약, 입력한 점수가 100점 초과 0점미만이면
 *        잘못입력했습니다.라고 메시지 주기
 */
public class GradeReport {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 과목, 점수를 입력해주세요.");
		String name = scanner.next();
		String subject = scanner.next();
		int score = scanner.nextInt();
		char grade = ' ';
		if (score >= 0 && score <= 100) {

			grade = (score >= 90) ? 'A'
					: ((score >= 80) ? 'B'
							: ((score >= 70) ? 'C' : ((score >= 60) ? 'D' : ((score >= 50) ? 'E' : 'F'))));
		} else {
			System.out.println("잘못입력했습니다.");
		}

		System.out.println("*********************");
		System.out.println("이름	과목	점수	학점");
		System.out.println("---------------------");
		System.out.println(name + subject + score + grade);
		System.out.println("*********************");
	}
}
