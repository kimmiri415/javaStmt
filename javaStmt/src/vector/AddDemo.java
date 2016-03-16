/**
 * 
 */
package vector;

import java.util.List;
import java.util.Vector;

/**
 * @file AddDemo.java
 * @author rlaalfl92@gmail.com
 * @date 2016. 3. 15.
 * @story 벡터 add() 데모
 *
 */
public class AddDemo {
	public static void main(String[] args) {
		List<String> vc = new Vector<String>();
		String a = "a", b = "b", c = "c", d = "d";
		vc.add(a);
		vc.add(b);
		vc.add(c);
		vc.add(d);
		System.out.println(vc);
		System.out.println("------------------------------");
		String []strArr = new String[5];
		String sa="a",sb="b",sc="c",sd="d";
		strArr[0]=sa;
		strArr[1]=sb;
		strArr[2]=sc;
		strArr[3]=sd;
	
		for (int j = 0; j < strArr.length; j++) {
			System.out.print(strArr[j]+"\t");
		}
		
	}
}
