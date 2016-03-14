/**
 * 
 */
package switchcase;

import java.util.Scanner;

/**
 * @file Calc.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 사칙연산기
 *
 */
public class CalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자,연산기호,숫자 입력 :");
		Calc c = new Calc();
		c.getCalc(scanner.nextInt(), scanner.next(), scanner.nextInt());
		System.out.println(c);
	}
}
