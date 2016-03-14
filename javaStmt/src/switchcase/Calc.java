/**
 * 
 */
package switchcase;

/**
 * @file Calc.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 14.
 * @story
 *
 */
public class Calc {
	private int a, b, result;
	private String opcode, strSub, strResult;

	public void getCalc(int a, String opcode, int b) {
		this.a = a;
		this.opcode = opcode;
		this.b = b;
		setResult();
	}

	public void setResult() {
		switch (opcode) {
		case "+":
			this.result = a + b;
			break;
		case "-":
			this.result = a - b;
			break;
		case "*":
			this.result = a * b;
			break;
		case "/":
			strSub = ((a == 0 || b == 0) ? "입력 숫자 에러" : (a + opcode + b + " = 몫" + a / b + " 나머지" + a % b));
			return;
		}
	}

	@Override
	public String toString() {
		strResult = (opcode.equals("+") || opcode.equals("-") || opcode.equals("*")) ? (a + opcode + b + "=" + result)
				: ((opcode.equals("/")) ? strSub : "연산기호를 잘못입력");
		return strResult;
	}

}
