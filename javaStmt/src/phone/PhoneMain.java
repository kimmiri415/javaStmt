/**
 * 
 */
package phone;

import java.util.Scanner;

public class PhoneMain {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("=== 통화 ===");
		PhoneMain pm = new PhoneMain();
		// pm.usePhone(s);
		// pm.useNokia(s);
		// pm.useIphone(s);
		pm.useAnroidPhone(s);
	}

	public void useAnroidPhone(Scanner s) {
		AndroidPhone androidPhone = new AndroidPhone();
		androidPhone.setCompany("안드로이드폰");
		System.out.println(androidPhone.getCompany() + "를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람 ?, 메시지 내용 입력, 화면크기");
		androidPhone.setData(s.next(), s.next(), s.next());
		System.out.println(androidPhone.getData());
	}

	public void useIphone(Scanner s) {
		IPhone iPhone = new IPhone();
		iPhone.setCompany("애플");
		System.out.println(iPhone.getCompany() + "를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람 ?, 메시지 내용 입력");
		iPhone.setData(s.next(), s.next());
		System.out.println(iPhone.getData());
	}

	public void useNokia(Scanner s) {
		Phone nokia = new CelPhone(); // DeepCopy
		// 부모의 타입이면 그자식의 생성자를 통해 인스턴스를 생성할 수 있다.
		nokia.setCompany("노키아");
		System.out.println(nokia.getCompany() + "를 사용합니다.");
		System.out.println("휴대폰으로 통화할 사람 ?");
		nokia.setCall(s.next());
		System.out.println(nokia.getCall());
	}

	public void usePhone(Scanner s) {
		Phone phone = new Phone();
		phone.setCompany("삼성 집 전화기");
		System.out.println(phone.getCompany() + "를 사용합니다.");
		System.out.println("통화할 사람 ?");
		phone.setCall(s.next());
		System.out.println(phone.getCall());
	}
}
