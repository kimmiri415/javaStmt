/**
 * 
 */
package forloop;

/**
 * @file Gugudan.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 11.
 * @story 2단부터 9단 까지 구구단출력 단, 책받침 구구단으로 출력 (4단씩)
 *
 */
public class Gugudan {
	public static void main(String[] args) {
		int i = 0, j = 0;

		for (i = 1; i < 10; i++) {
			for (j = 2; j <= 5; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println("");

		}
		System.out.println("");

		for (i = 1; i < 10; i++) {
			for (j = 6; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + j * i + "\t");
			}
			System.out.println("");

		}
	}
}
