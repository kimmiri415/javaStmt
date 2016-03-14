/**
 * 
 */
package ifelse;

/**
 * @file Gender.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class Gender {
	String name, ssn, gender;
	char flag;

	public void setGender(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		this.gender = gender;
		this.flag = ssn.charAt(7);
		/**
		 * 900101-1234567일때 charAt(인덱스값)은 인덱스에 해당하는 한글자를 반환 단, 인덱스는 0부터 시작
		 */
		gender = ((flag == '1' || flag == '3') ? "남자"
				: ((flag == '2' || flag == '4') ? "여자" : ((flag == '5' || flag == '6') ? "외국인" : "")));
	}

	public String toString() {
		String result = (!gender.equals("")) ? "결과 : " + name + "님의 성별은 " + gender + "입니다." : "주민번호가잘못되었습니다.";
		return result;
	}

}
