package chap13;

import java.util.List;
import java.util.Vector;

/*
 * Vector 클래스
 *  - Collection 프레임워크 이전의 클래스
 *  - List 인터페이스의 구현클래스
 *  - 구버전의 메서드와 List 인터페이스의 메서드가 공존함
 *  
 *  List 인터페이스 객체 특징
 *  - 추가(add)한 순서 유지
 *  - 인덱스(첨자) 사용
 */

public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>();
		List<Double> list2 = new Vector<>();

		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0); // 구버전 메소드, List.add()와 동일한 기능

		double num = 5.0;
		int index = list.indexOf(num);
		if (index < 0) {
			System.out.println("list의 요소 아님");
		} else
			System.out.println(num + "의 위치: " + index);

		// contains(): 요소가 존재하니?
		if (list.contains(num)) {
			System.out.println("list의 요소임");
		} else
			System.out.println("list의 요소 아님");
		
		//remove(): 요소 제거, 제거 값 리턴
		//remove(Object): 요소 값 제거
		//remove(int): 인덱스에 해당하는 요소 제거
		
		System.out.println();
		System.out.println(list.get(0)); //0.3
		list.remove(0.3); //0.3 제거
		System.out.println(list);
		//0.3 값이 제거되어 인덱스 0번은 Math.PI 가 됨
		
		System.out.println(list.get(0)); //Math.PI
		System.out.println(list.remove(0)); //Math.PI
		System.out.println(list); //5.0

	}

}
