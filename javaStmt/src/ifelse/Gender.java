package ifelse;

import java.util.Scanner;

/**
 * @file Gender.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직
 *
 */
public class Gender {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 주민번호를 입력하세요");

		String name = scanner.next(), ssn = scanner.next();
		String gender = "";
		char flag = ssn.charAt(7);
		/**
		 * 900101-1234567일때 charAt(인덱스값)은 인덱스에 해당하는 한글자를 반환 단, 인덱스는 0부터 시작
		 */
		if (flag == '1' || flag == '3') {
			gender = "남자";
		} else if (flag == '2' || flag == '4') {
			gender = "여자";
		} else if (flag == '5' || flag == '6') {
			gender = "외국인";
		} else {
			System.out.println("주민번호가 잘못되었습니다.");
			return;
		}
		System.out.println(name + "님은" + gender + "입니다.");
	}
}
