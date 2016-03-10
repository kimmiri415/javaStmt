/**
 * 
 */
package whileloop;

import java.util.Scanner;

/**
 * @file NumGolfMain.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story 컴퓨터가 랜덤 생성한 숫자를 가장 빠른 횟수로 맞추는 게임
 *
 */
public class NumGolfMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("컴퓨터 랜덤 수 발생");
		NumGolfBean bean = new NumGolfBean();
		bean.setCom();

		while (bean.isFlag() == false) {
			System.out.println("숫자 입력 :");
			bean.setPlayer(scanner.nextInt());

		}
		System.out.println(bean.toString());
	}

}
