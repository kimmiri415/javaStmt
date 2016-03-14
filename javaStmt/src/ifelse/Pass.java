/**
 * 
 */
package ifelse;

/**
 * @file Pass.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class Pass {
	private String name, pass;
	private int java, jsp, sql, spring, sumScore = 0;
	private double avgScore = 0.0;

	public void getPassInfo(String name, int java, int jsp, int sql, int spring) {
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
		this.avgScore = sumScore / 4 + sumScore % 4;
	}

	public void setPass() {
		this.pass = (sumScore >= 60) ? "합격" : "불합격";

	}

	@Override
	public String toString() {
		return name + "  " + java + "점   " + jsp + "점   " + sql + "점   " + spring + "점   " + sumScore + "점   "
				+ avgScore + "점   " + pass;
	}

}
