/**
 * 
 */
package bank;

import java.util.Scanner;

/**
 * @file BankMain.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story
 *
 */
public class BankMain {
	public static void main(String[] args) {
		String name = "";
		int pw;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, password입력하세요");

		AccountBean a = new AccountBean(scanner.next(), scanner.nextInt());

		System.out.println(a.toString());
	}
}
