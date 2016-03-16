/**
 * 
 */
package phone;

public class AndroidPhone extends IPhone {
	public final static String BRAND = "안드로이드폰";// 오버라이딩 -재정의
	private String size;
	private String data;// 부모클래스의 프로퍼디와 동일하게 선언

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getData() {
		return data;
	}

	// 오버로딩 - 중복정의
	public void setData(String name, String data, String size) {
		super.setCompany(BRAND);// BRAND 오버라이딩!
		super.setPortable(TRUE);
		super.setCall(name);
		this.setSize(size);
		this.data = super.getCompany() + "\t" + super.isPortable() + "\t" + super.getCall() + "\t" + "대화면  "
				+ this.getSize() + "로 볼 수 있다 " + data + " : 카톡 메시지 전달";
	}

}
