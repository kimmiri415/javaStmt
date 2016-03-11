/**
 * 
 */
package forloop;

import java.util.Scanner;

/**
 * @file InputSum.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 1부터 입력된 수까지의 정수의합 구하기 ex) 10을 입력하면 콘솔에는 1부터 10까지의 합은 55입니다.
 *
 */
public class InputSum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Limit값을 입력해주세요 :");
		int inputNum = scanner.nextInt();
		int Sum = 0;

		for (int i = 1; i <= inputNum; i++) {
			Sum += i;
		}
		System.out.println(inputNum + "을 입력하면 콘솔에는 1부터 " + inputNum + "까지의 합은 " + Sum + "입니다.");
	}
}
