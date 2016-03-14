/**
 * 
 */
package switchcase;

/**
 * @file Pass.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class Pass {
	private String name, pass = "불합격", result;
	private int java, jsp, sql, spring, sumScore, avgScore;

	public void getResult(String name, int java, int jsp, int sql, int spring) {
		this.name = name;
		this.java = java;
		this.jsp = jsp;
		this.sql = sql;
		this.spring = spring;
		setSumScore();
		setAvgScore();
		setPass();
	}

	public void setSumScore() {
		this.sumScore = java + jsp + sql + spring;
	}

	public void setAvgScore() {
		this.avgScore = sumScore / 4;
	}

	public void setPass() {
		this.pass = pass;
		switch (avgScore / 10) {

		case 10:
		case 9:
		case 8:
		case 7:
		case 6:

			this.pass = "합격";
			break;
		}

	}

	public String toString() {
		result = ((avgScore / 10) >= 0 && (avgScore / 10) <= 10) ? (name + "   " + java + "점  " + jsp + "점  " + sql
				+ "점  " + spring + "점  " + sumScore + "점  " + avgScore + "점  " + pass) : "입력값오류";
		return result;
	}

}
