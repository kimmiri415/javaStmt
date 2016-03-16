package atm;

public class ATM {
	public synchronized void inchul(String name) {
		System.out.println(name + "님이 인출요청함");
		for (int i = 0; i < 100000000; i++) {
			if (i == 1000000) {
				System.out.println(name + "이 현금을 인출중...");

			}

		}
		System.out.println(name + "인출해 나감");
	}
}
