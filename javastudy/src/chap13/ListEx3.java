
package chap13;
/*
 * <List 객체 정렬하기>
 * 
 * Collection.sort(List)
 * -> List 요소의 자료형이 Comparable 인터페이스로 형변환이 가능해야 함 
 * 	  Comparable 인터페이스를 구현한 클래스의 객체만 가능함
 * 
 * Comparable 인터페이스: compareTo() 추상메소드를 가짐
 * -> 객체 기본 정렬 방식을 설정
 * Comparator 인터페이스: compare() 추상메소드를 가짐
 * -> 실행 중 정렬 방식 설정 시 사용
 * -> Comparator Comparator.reverseOrder(): 기본 정렬 방식의 역순
 * 											Comparator 인터페이스의 static 메소드임 
 * 
 * 정렬 관련 인터페이스
 * 1. Comparable<T>: 요소의 기본 정렬 방식 설정 시 클래스에서 구현함
 * 					 int compareTo(T o)
 * 					  -> 양수: 현재 객체 뒤쪽
 * 					  -> 음수: 현재 객체 앞쪽
 * 2. Comparator<T>: 기본 정렬 방식과 무관하게 실행 중 다른 정렬 방식 설정 시 객체화하여 사용
 * 					 동적 정렬 방식 구현 시 사용
 * 					 int compare(T o1, T o2)
 * 					  -> 양수: o1 객체 뒤쪽
 * 					  -> 음수: o1 객체 앞쪽
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Data1 implements Comparable<Data1> {
	int value;

	Data1(int value) {
		this.value = value;
	}

	public String toString() {
		return "(" + value + ")";
	}

	@Override
	public int compareTo(Data1 o) {
		return (value - o.value); // 음수: 현재 객체 앞, 양수: 현재 객체 뒤
	}
}

class Data2 {
	int value;

	Data2(int value) {
		this.value = value;
	}

	public String toString() {
		return "(" + value + ")";
	}
}

public class ListEx3 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("v");
		list1.add("d");
		list1.add("f");
		System.out.println(list1);

		// Collections 클래스: Collection 객체의 보조기능 담당
		System.out.println("정렬 후");
		Collections.sort(list1);
		System.out.println(list1);

		// 내림차순 정렬
		System.out.println("내림차순 정렬");
		Collections.sort(list1, Comparator.reverseOrder());
		System.out.println(list1);

		// 사용 클래스의 객체 정렬
		System.out.println("사용 클래스의 객체 정렬");
		List<Data1> list2 = new ArrayList<>();
		list2.add(new Data1(3));
		list2.add(new Data1(1));
		list2.add(new Data1(2));
		System.out.println(list2);
		
		System.out.println();
		System.out.println("역순");
		Collections.sort(list2, Comparator.reverseOrder());
		System.out.println(list2);
		
		List<Data2> list3=new ArrayList<>();
		list3.add(new Data2(3));
		list3.add(new Data2(1));
		list3.add(new Data2(2));
		System.out.println(list3);
		
		System.out.println();
		Comparator<Data2> c=new Comparator<>() {
			@Override
			public int compare(Data2 o1, Data2 o2) {
				return o1.value-o2.value; 
				//음수: o1 객체가 앞, 양수: o1 객체가 뒤
			}
		};
		
		Collections.sort(list3,c); //c 객체가 설정된 방식으로 정렬
		System.out.println(list3);
		
		//Comparator 인터페이스 객체: 람다식으로 객체 생성 가능 
		Collections.sort(list3,(o1,o2)->o2.value - o1.value); //c 객체가 설정된 방식으로 정렬
		System.out.println(list3); //내림차순 정렬
	}

}