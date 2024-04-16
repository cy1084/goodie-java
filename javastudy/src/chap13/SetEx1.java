package chap13;

import java.util.HashSet;
import java.util.Set;

/*
 * Collections: 객체들의 모임
 * - List: 순서 있음, 인덱스 사용, 가변 배열
 * 		-> 구현 클래스: ArrayList, Vector, LinkedList
 * - Set: 중복 불가, 인덱스 사용 불가
 * 		-> 구현 클래스: HashSet(저장 순서 보장x), TreeSet(정렬), LinkedHashSet(순서있음)
 * 		-> 주요 메소드: boolean add(Object)=> 추가 성공(true)/ 추가 실패(false)
 * 
 */

public class SetEx1 {
	public static void main(String[] args) {
		Object[] arr = { "홍길동", 1, "1", "김삿갓", "이몽룡", "홍길동", "성춘향", "향단이", "홍길동", "김삿갓" };
		Set<Object> set1 = new HashSet<>();
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (!set1.add(arr[i])) {
				if (!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);

		System.out.println();
		for (Object o : set1) {
			System.out.println(o);
		}

	}

}
