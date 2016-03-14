/**
 * 
 */
package array;

import java.util.Scanner;

/**
 * @file MaxValue.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story 배열의 요소 중 가장 큰 값 출력
 *
 */
public class MaxValueMain {
	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println(
		 * "정수값 3개 입력 :"); int a = scanner.nextInt(), b = scanner.nextInt(), c =
		 * scanner.nextInt();
		 */
		int[] arr = { 32, 26, 76, 44, 66, 30 };
		MaxValue mv = new MaxValue();
		System.out.println("배열중에서 가장 큰 값은 " + mv.getMax(arr) + "입니다.");

	}
}
