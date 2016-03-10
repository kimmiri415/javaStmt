package forloop;

/**
 * @file OddSum.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story 1부터 10까지 홀수의 합
 *
 */
public class OddSum {
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0, i = 0;
		System.out.println("1번째 방법");
		for (i = 1; i <= 10; i += 2) {
			sum1 += i;
		}
		System.out.println("1부터 10까지 홀수의 합 :" + sum1);
		System.out.println();
		System.out.println("2번째 방법");
		for (i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				sum2 += i;

			}
		}
		System.out.println("1부터 10까지 홀수의 합 :" + sum2);

	}
}
