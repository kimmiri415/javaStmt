/**
 * 
 */
package ifelse;

import java.util.Scanner;

/**
 * @file BigNumber.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 입력된 3개 숫자에서 가장 큰수
 *
 */
public class BigNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("3개의 숫자를 입력하세요 :");
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		int big = 0;
		if (a > b && a > c) {
			big = a;
		} else if (b > a && b > c) {
			big = b;
		} else if (c > a && c > b) {
			big = c;
		}
		System.out.println("가장 큰 수는 " + big + "입니다.");
	}
}
