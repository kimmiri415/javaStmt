/**
 * 
 */
package ifelse;

/**
 * @file BigNumber.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class BigNumber {

	// public BigNumber() {}

	public int getBigNumber(int a, int b, int c) {

		int big = 0;

		big = ((a > b && a > c) ? a : ((b > a && b > c) ? b : c));

		return big;

	}
}
