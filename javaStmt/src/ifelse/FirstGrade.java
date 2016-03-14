/**
 * 
 */
package ifelse;

/**
 * @file FirstGrade.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class FirstGrade {
	private String maxName = "";
	private int maxScore = 0;

	public void setMax(String aName, int aScore, String bName, int bScore, String cName, int cScore) {
		if (aScore > bScore && aScore > cScore) {
			this.maxName = aName;
			this.maxScore = aScore;
		} else if (bScore > aScore && bScore > cScore) {
			this.maxName = bName;
			this.maxScore = bScore;
		} else if (cScore > aScore && cScore > bScore) {
			this.maxName = cName;
			this.maxScore = cScore;
		}

	}

	public String toString() {
		return "결과 : " + maxName + "님의 점수 " + maxScore + "점이 1등입니다.";
	}
}
