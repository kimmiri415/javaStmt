/**
 * 
 */
package ifelse;

/**
 * @file Trinomial.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class Trinomial {
	private int avg;
	private String name, result;

	public Trinomial(String name, int kor, int eng, int math) {
		this.name = name;
		setAvg(kor, eng, math);
		setResult(avg);
	}

	public int setAvg(int kor, int eng, int math) {
		this.avg = (int) ((kor + eng + math) / 3);
		return avg;
	}

	public String setResult(int avg) {
		this.result = (avg >= 60) ? "합격" : "불합격";
		return result;
	}

	@Override
	public String toString() {
		return "성적표 [학생이름 : " + name + ", 평균 : " + avg + ", 결과 : " + result + "]";
	}

}
