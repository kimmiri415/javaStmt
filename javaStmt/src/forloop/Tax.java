/**
 * 
 */
package forloop;

/**
 * @file Tax.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class Tax {
	private int salaryYear, tax;
	private String name;

	public void setTax(String name, int salaryYear) {
		this.name = name;
		this.salaryYear = salaryYear;
		this.tax = (int) (salaryYear * (0.1) / 12);
	}

	public String toString() {

		return "결과 : 연봉 " + salaryYear + "만원을 받으시는, " + name + "님께서 이번달 납부한 세금은 " + tax + "만원입니다.";
	}

}
