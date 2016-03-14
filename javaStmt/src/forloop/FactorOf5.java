/**
 * 
 */
package forloop;

/**
 * @file FactorOf5.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class FactorOf5 {
	private int endNum, count = 0, sum = 0;

	public String getFactor(int endNum) {
		this.endNum = endNum;
		for (int i = 1; i <= endNum; i++) {
			if (i % 5 == 0) {
				++count;
				sum += i;
			}
		}
		return "결과 : 1부터 " + endNum + "까지의 정수 중 " + "5배수의 갯수 : " + count + ", 5배수의 합 : " + sum + "이다.";
	}

}
