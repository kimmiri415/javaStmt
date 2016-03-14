/**
 * 
 */
package array;

/**
 * @file MaxMinMain.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story 배열의 최대값,최소값 구하기
 *
 */
public class MaxMinMain {
	public static void main(String[] args) {
		int[] arr = { 100, 80, 69, 58, 76, 43, 88, 54, 63 };
		MaxMin mm = new MaxMin();
		mm.setMaxMin(arr);
		System.out.println(mm.toString());
	}
}
