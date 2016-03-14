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
public class InputSumMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Limit값을 입력해주세요 :");
		InputSum is = new InputSum();
		is.setSum(scanner.nextInt());
		System.out.println(is);
	}
}
