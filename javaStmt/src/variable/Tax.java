/**
 * 
 */
package variable;

import java.util.Scanner;

/**
 * @file Tax.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story
 *
 */
public class Tax {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name = "";
		int salaryYear = 0, tax = 0;
		System.out.println("이름, 연봉 입력");
		name = scanner.nextLine();
		salaryYear = scanner.nextInt();
		tax = (int) (salaryYear * (0.1));
		System.out.println("[결과] 연봉" + salaryYear + "만원을 받으시는 " + name + "님께서 이번달 납부할 세금은 " + tax + "만원입니다.");
	}
}
