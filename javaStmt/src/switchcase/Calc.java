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
public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자,연산기호,숫자 입력 :");
		int a = scanner.nextInt();
		String opcode = scanner.next();
		// + - * / 단 나눗셈은 몫과 나머지로 출력
		int b = scanner.nextInt();
		int result = 0;
		switch (opcode) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if (a == 0 || b == 0) {
				System.out.println("입력 숫자 에러");
				return;
			}
			System.out.println(a + opcode + b + " = 몫" + a / b + " 나머지" + a % b);
			return;

		default:
			System.out.println("연산기호를 잘못입력");
			return;
		}
		System.out.println(a + opcode + b + "=" + result);
	}
}
