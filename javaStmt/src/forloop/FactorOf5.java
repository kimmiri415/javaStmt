package forloop;

import java.util.Scanner;

/**
 * @file FactorOf5.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 5의 배수의 갯수와 합
 *
 */
public class FactorOf5 {
	/**
	 * [결과] 1에서 100까지의 정수 중 5배수의 갯수는 20이고 5배수의 합은 1050이다.
	 */

	public static void main(String[] args) {
		int endNum = 0, count = 0, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Limit값 입력 :");
		endNum = scanner.nextInt();

		for (int i = 1; i <= endNum; i++) {
			if (i % 5 == 0) {
				++count;
				sum += i;
			}
		}

		System.out.println("[결과] 1에서 " + endNum + "까지의 정수 중 " + "5배수의 갯수는 " + count + "이고F" + "5배수의 합은 " + sum + "이다.");
	}
}
