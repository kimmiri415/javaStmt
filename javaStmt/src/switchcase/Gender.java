/**
 * 
 */
package switchcase;

public class Gender {

	String name, gender, result, ssn;
	char flag;

	public void getGender(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		this.flag = ssn.charAt(7);
		setGender();
	}

	public void setGender() {
		switch (flag) {
		case '1':
		case '3':
			this.gender = "남자";
			break;
		case '2':
		case '4':
			this.gender = "여자";
			break;
		case '5':
		case '6':
			this.gender = "외국인";
			break;
		}
	}

	@Override
	public String toString() {
		result = (flag >= '1' && flag <= '6') ? ("결과 : " + name + "님은 " + gender + "입니다.") : "주민번호가 잘못되었습니다.";
		return result;
	}

}
