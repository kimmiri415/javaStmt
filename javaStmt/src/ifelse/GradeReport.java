/**
 * 
 */
package ifelse;

/**
 * @file GradeReport.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class GradeReport {
	private String name, subject, result;
	private char grade = 0;
	private int score;

	public void setGrade(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
		if (score >= 0 && score <= 100) {

			this.grade = (score >= 90) ? 'A'
					: ((score >= 80) ? 'B'
							: ((score >= 70) ? 'C' : ((score >= 60) ? 'D' : ((score >= 50) ? 'E' : 'F'))));
		}
	}

	@Override
	public String toString() {
		result = (grade != 0) ? name + "    " + subject + "    " + score + "    " + grade : "잘못입력했습니다.";
		return result;
	}

}
