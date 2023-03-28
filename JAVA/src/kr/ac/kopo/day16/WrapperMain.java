package kr.ac.kopo.day16;

import java.util.ArrayList;
import java.util.List;

/*		
 * 		기본자료형				참조자료형
 * 		boolean				Boolean		
 * 		char				Character
 * 		byte				Byte
 * 		short				Short
 * 		int					Integer
 * 		long				Long
 * 		float				Float
 * 		double				Double
 * 
 * 		ex) class Boolean{
 * 				private boolean value;
 * 			}
 * 		
 * 		ex) new ArrayList<Integer> 이런 식으로 써줘야 함
 */

public class WrapperMain {
	
	public static void main(String[] args) {
		
		int i = 12;
		System.out.println("i : " + i);
		
		Integer i2 = new Integer(12);
		System.out.println("i2 : " + i2);
		
		int i3 = i2;	//i3는 기본자료형 i2는 참조자료형	오토 언박싱 auto unboxing
		Integer i4 = i;	//원래는 위아래 다 안되는데 지가 알아서 Integer라는 박스를 만들어서 int를 넣어준다 : 오토박싱 auto boxing
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(100));
		list.add(20);
	}

}
