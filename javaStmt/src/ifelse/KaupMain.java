/**
 * 
 */
package ifelse;

import java.util.Scanner;

/**
 * @file Kaup.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 10.
 * @story 카우푸 지수 구하기 몸무게를 키의 제곱으로 나누어 구한 후 10000을 곱하면 지수가 생성된다. 이를 카우푸 지수라고 한다.
 *        카우푸지수 30초과면 비만 24이상이면 과체중 20이상이면 정상 15이상이면 저체중 13이상이면 마름 10이상이면 영양실조
 *        10이하이면 소모증으로 판별된다. 이름과 키와 몸무게를 입력하면 홍길동님은 비만입니다. 라고 출력하는 프로그램을 작성하시오
 */

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Kaup k = new Kaup();

		System.out.println("이름, 키 ,몸무게 입력");
		k.setName(scanner.next());
		k.setHeight(scanner.nextDouble());
		k.setWeight(scanner.nextDouble());
	
		k.setResult();
		System.out.println(k.toString());
	}

}
