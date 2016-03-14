/**
 * 
 */
package ifelse;

import java.util.Scanner;

/**
 * @file Trinomial.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class TrinomialMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("이름,국어,영어,수학 점수 입력");
		Trinomial tri = new Trinomial(s.next(), s.nextInt(), s.nextInt(), s.nextInt());
		System.out.println(tri.toString());
	}
}
