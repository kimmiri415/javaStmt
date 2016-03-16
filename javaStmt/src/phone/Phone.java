/**
 * 
 */
package phone;

/**
 * @file Phone.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 16.
 * @story 폰의 확장을 통해 상속의 개념을 이해해 보자
 *
 */
public class Phone {

	protected String call,company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call + "에게 전화를 검";
	}

}
