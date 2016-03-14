/**
 * 
 */
package array;

/**
 * @file MaxValue.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class MaxValue {
	int max;

	public int getMax(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

}
