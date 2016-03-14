/**
 * 
 */
package forloop;

/**
 * @file InputGugudan.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class InputGugudan {
	private int dan, mul, i;
	private String result = "";

	public String getGugudan(int dan) {
		this.dan = dan;
		if (dan <= 0) {
			result = "1이상 정수값만 입력하시오";
		} else {
			for (i = 2; i < 10; i++) {
				this.mul = dan * i;
				result += toString() + "\n";
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "InputGugudan [" + dan + "단," + dan + "*" + i + "=" + mul + "]";
	}

}
