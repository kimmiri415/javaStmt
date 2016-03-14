/**
 * 
 */
package forloop;

import java.util.Arrays;

/**
 * @file MaxMin.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class MaxMin {
	private int[] arr = new int[5];
	private int max, min;

	public void setArr(int[] arr) {
		this.arr = arr;
		max = arr[0];
		min = arr[0];
		setMaxMin();
	}

	public void setMaxMin() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= max) {
				this.max = arr[i];
			}
			if (arr[i] <= min) {
				this.min = arr[i];
			}
		}
	}

	@Override
	public String toString() {
		return "MaxMin결과 [입력받은 점수 : " + Arrays.toString(arr) + ", 최고점 : " + max + ", 최저점 : " + min + "]";
	}

}
