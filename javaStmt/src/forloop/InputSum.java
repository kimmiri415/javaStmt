/**
 * 
 */
package forloop;

/**
 * @file InputSum.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class InputSum {
	private int inputNum, sum;

	public void setSum(int inputNum) {
		this.inputNum = inputNum;
		for (int i = 1; i <= inputNum; i++) {
			this.sum += i;
		}

	}

	@Override
	public String toString() {
		return "1부터 " + inputNum + "까지 정수의 합 : " + sum + "입니다.";
	}

}
