package chap13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Iterator 인터페이스: 반복자/ Collection 안에 있는 메소드이므로 Map엔 사용 불가
 * - Collection 객체를 Iterator 인터페이스 객체로 변경 가능-> iterator() 메소드 이용
 * 
 * =>멤버 메소드
 * - boolean hasNext(): 다음 거 가지고 있니? (조회 가능한 객체 존재?)
 * - Object next(): 객체 조회
 * - void remove(): 조회된 객체를 제거해줘/ 반드시 next() 실행 후 호출 해야 함
 * 
 *
 * Enumeration 인터페이스(보기만 하기): Iterator 이전에 사용되었던 반복자
 *								   Vector, HashTable만 사용 가능/ remove 불가
 *
 * =>멤버 메소드
 * - boolean hasMoreElement(): 다음 거 가지고 있니? (조회 가능한 객체 존재?)
 * - Object nextElement(): 객체 조회
 * - remove 불가
 */


//다시
public class IteratorEx1 {
	public static void main(String[] args) {
		Iterator<Integer> it=null;
		List<Integer> list=new ArrayList<>();
		Set<Integer> set=new HashSet<>();
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int i=1;i<=5;i++) {
			list.add(i+10);
			set.add(i*10);
		}
		System.out.println(list);
		System.out.println(set);
		
		System.out.println();
		it=list.iterator(); //list를 Iterator 객체로 변경
		printnremove(it);
		System.out.println("printnremove 후 list: "+list);
		System.out.println("printnremove 후 set: "+set);
		
		//map에 iterator 쓰기 위해서는 set으로 변경하여 써야 함
		//map.keySet().iterator()
		it=map.keySet().iterator();
		printnremove(it);
		
	}

	private static void printnremove(Iterator<Integer> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove(); //next() 리턴된 객체 제거
		}
		
	}	

}
