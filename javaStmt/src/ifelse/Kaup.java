/**
 * 
 */
package ifelse;

/**
 * @file Kaup.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story
 *
 */
// 객체는 속성과 기능
public class Kaup {
	// 속성영역 : field
	private String name;

	private int kaup;
	private double height, weight;
	private String result;
	// kaup=(int)((weight/Math.pow(height,2))*10000);

	// ALT SHIFT S R :get/set
	// 기능영역 : area
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @return the kaup
	 */
	public int getKaup() {
		return kaup;
	}

	/**
	 * @param kaup
	 *            the kaup to set
	 */
	public void setKaup() {
		this.kaup = (int) ((getWeight() / Math.pow(getHeight(), 2)) * 10000);
	}

	/**
	 * @return the result
	 */
	public String getResult() {

		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult() {
		String temp = "";
		if (kaup > 30) {
			temp = "비만";
		} else if (kaup >= 24) {
			temp = "과체중";

		} else if (kaup >= 20) {
			temp = "정상";

		} else if (kaup >= 15) {
			temp = "저체중";

		} else if (kaup >= 13) {
			temp = "마름";

		} else if (kaup >= 10) {
			temp = "영양실조";

		} else {
			temp = "소모증";
		}

		this.result = temp;
	}
}
