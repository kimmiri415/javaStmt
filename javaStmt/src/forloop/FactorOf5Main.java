package forloop;

import java.util.Scanner;

/**
 * @file FactorOf5.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 5의 배수의 갯수와 합
 *
 */
public class FactorOf5Main {
	/**
	 * [결과] 1에서 100까지의 정수 중 5배수의 갯수는 20이고 5배수의 합은 1050이다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Limit값 입력 :");
		FactorOf5 fo = new FactorOf5();
		fo.calFactor(scanner.nextInt());
		System.out.println(fo);
	}
}
