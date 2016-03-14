/**
 * 
 */
package switchcase;

import java.util.Scanner;

/**
 * @file Pass.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 과목점수를 입력하면 총점과 평균이 나오고 이를 통해 합격 여부를 통지하는 프로그램 [결과]
 *        **********************************************************************
 *        ***** 학생 자바 Jsp SQL 스프링 총점 평균 합격여부
 *        ----------------------------------------------------------------------
 *        ----- 홍길동 80 40 70 60 250 62.5 합격
 *        **********************************************************************
 *        ***** 합격여부는 총점이 60점 이상이면 합격
 */
public class PassMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = "", pass = "불합격";
		int java = 0, jsp = 0, sql = 0, spring = 0, sumScore = 0, avgScore = 0;
		System.out.println("이름과 자바,Jsp,Sql,스프링점수를 입력 :");
		Pass p = new Pass();
		p.getResult(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

		System.out.println("******************************************");
		System.out.println("학생   자바   Jsp   SQL   스프링   총점   평균   합격여부");
		System.out.println("------------------------------------------");
		System.out.println(p);
		System.out.println("******************************************");

	}

}
