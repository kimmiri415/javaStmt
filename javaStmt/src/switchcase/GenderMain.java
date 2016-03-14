package switchcase;

import java.util.Scanner;

/**
 * @file Gender.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직(switch case 사용)
 *
 */
public class GenderMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 주민번호를 입력하세요");
		Gender g = new Gender();
		g.getGender(scanner.next(), scanner.next());
		/**
		 * 900101-1234567일때 charAt(인덱스값)은 인덱스에 해당하는 한글자를 반환 단, 인덱스는 0부터 시작
		 */
		System.out.println(g);

	}
}
