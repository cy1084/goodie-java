package chap13;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * TreeSet 
 * - 정렬됨, 중복 불가
 * - Set의 하위 인터페이스 SortedSet의 구현 클래스
 */

public class SetEx3 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
//		Set<String> set = new TreeSet<>();
//		SortedSet<String> set = new TreeSet<>();
		
		String from = "bat";
		String to = "d";
		set.add("flower");
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("azz");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dzzzz");
		set.add("dZZZZ");
		set.add("elev");
		set.add("fan");
		System.out.println(set);
		
		// subSet(시작요소, 끝요소앞까지) : SortedSet의 멤버메서드
		
		System.out.println("from:" + from + ", to:" + to);
		System.out.println(set.subSet(from, to));
		System.out.println("from:" + from + ", to:" + to + "zzzz");
		System.out.println(set.subSet(from, to + "zzzz"));
		
		// 기존의 set을 이용하여 set 객체 생성하기
		TreeSet<String> set2 = new TreeSet<>(set);
		System.out.println(set2);

	}

}
