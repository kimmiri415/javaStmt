/**
 * 
 */
package forloop;

import java.util.Scanner;

/**
 * @file Tax.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story
 *
 */
public class TaxMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name = "";
		int salaryYear = 0, tax = 0;
		System.out.println("이름, 연봉 입력 : ");
		Tax t = new Tax();
		t.setTax(scanner.next(), scanner.nextInt());
		System.out.println(t.toString());

	}
}
