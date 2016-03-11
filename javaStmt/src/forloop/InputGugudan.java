/**
 * 
 */
package forloop;

import java.util.Scanner;

/**
 * @file InputGugudan.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 입력받은 정수의 구구단 구하기 예를 들면 2를 입력하면 2단 출력 109를 입력하면 109*2 ~ 109*9까지 출력 다만,
 *        0과 음수를 입력하면 "1이상 정수값만 입력하시오 라고 출력"
 *
 */
public class InputGugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요 :");
		int inputNum = scanner.nextInt();

		if (inputNum <= 0) {
			System.out.println("1이상 정수값만 입력하시오 ");
		} else {
			for (int i = 2; i < 10; i++) {
				System.out.println(inputNum + " * " + i + " = " + inputNum * i);

			}
		}

	}
}
