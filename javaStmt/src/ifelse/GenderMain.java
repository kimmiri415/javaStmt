package ifelse;

import java.util.Scanner;

/**
 * @file Gender.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 주민번호를 가지고 성별 판별하는 로직
 *
 */
public class GenderMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 주민번호를 입력하세요");
		Gender g = new Gender();
		g.setGender(scanner.next(), scanner.next());
		System.out.println(g);
	}
}
