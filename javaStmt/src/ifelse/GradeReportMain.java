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
public class GradeReportMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 과목, 점수를 입력해주세요.");
		GradeReport gr = new GradeReport();
		gr.setGrade(scanner.next(), scanner.next(), scanner.nextInt());
		System.out.println("*********************");
		System.out.println("이름	과목	점수	학점");
		System.out.println("---------------------");
		System.out.println(gr);
		System.out.println("*********************");
	}
}
