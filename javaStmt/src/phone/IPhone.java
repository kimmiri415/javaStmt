/**
 * 
 */
package phone;

public class IPhone extends CelPhone {
	private String data;
	public static String BRAND = "아이폰";
	public static boolean TRUE = true;

	// 아이폰은 집전화기는 생산하지 않는다.
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	// 오버로딩 -중복정의
	public void setData(String name, String data) {

		super.setCompany(BRAND);
		super.setPortable(TRUE);
		this.setCall(name);
		this.data = super.getCompany() + "\t" + super.isPortable() + "\t" + super.getCall() + "\t" + "\t" + data
				+ " : 메시지 전달";

	}

}
