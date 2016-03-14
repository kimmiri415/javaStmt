/**
 * 
 */
package ifelse;

/**
 * @file TimeCalc.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class TimeCalc {
	private int inputSec, hour, min, sec, remain;

	public void getTimeCalc(int inputSec) {
		this.inputSec = inputSec;
		this.hour = inputSec / 3600;
		this.remain = inputSec % 3600;
		this.min = remain / 60;
		this.sec = remain % 60;
	}

	@Override
	public String toString() {
		return inputSec + "초는 " + hour + "시간 " + min + "분 " + sec + "초 입니다.";
	}

}
