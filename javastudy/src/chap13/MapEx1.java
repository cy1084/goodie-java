package chap13;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Collection Framework의 양대산맥
 * 
 * Collection 인터페이스(객체들의 모임)
 * - List: 순서 있음, 중복 가능, 인덱스 사용 가능, 가변 배열
 *  	-> 구현 클래스: ArrayList, Vector(구버전 list), LinkedList
 *  	-> 메소드: add(), get(), remove() 등
 * - Set: 순서 없음, 중복 불가(중복된 값 무시)
 * 		-> 구현 클래스: HashSet, TreeSet(객체 기준 정렬), LinkedHashSet
 * - Queue
 * 		-> 구현 클래스: LinkedList
 * 
 * 
 * Map 인터페이스(key로 객체를 구별/ key 중복 불가- 가장 나중에 들어간 값으로 수정)
 * - key-value 쌍으로 저장
 * 		-> 구현 클래스: HashMap, HashTable(구버전 map), TreeMap(키 기준 정렬)
 * 		-> 메소드: put(키값, 객체값): Map 객체에 데이터 추가, 수정 
 * 				 get(키값): 키값으로 등록된 객체의 값을 리턴/ 등록된 값 없으면 null 리턴
 * 				 remove(): 키에 해당하는 객체 제거/ 객체 값 리턴
 * 		-> 순회 메소드:
 * 				 keySet(): Map에 등록된 객체 중 key 값들의 목록 리턴/ Set으로 리턴
 * 				 values(): Map에 등록된 객체 중 객체 값들의 목록 리턴/ Collection으로 리턴
 * 				 entrySet(): Map에 등록된 객체를 (키, 객체)의 쌍인 객체로 리턴/ Set으로 리턴
 * 							 Map.Entry<키, 객체>: (키, 객체)의 쌍인 객체의 자료형
 * 
 * 
 * <String,   Integer>
 * 키의 자료형  객체의 자료형
 */
public class MapEx1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 1234);
		map.put("김삿갓", 2345);
		map.put("이몽룡", 3456);
		map.put("김삿갓", 4567);
		System.out.println(map);
		System.out.println("김삿갓의 전화번호: " + map.get("김삿갓"));
		System.out.println("홍길순의 전화번호: " + map.get("홍길순")); // 값이 없는 경우 null 리턴

		System.out.println();
		// keySet(): key 값들만 가져와
		System.out.println("===keySet()===");
		Set<String> keys = map.keySet(); // key 값은 중복 불가이기 때문에 데이터타입 Set으로!
		for (String k : keys) {
			System.out.println(k + "= " + map.get(k));
		}

		System.out.println();
		// values(): 객체값들만 가져와/ 키 값 조회는 불가
		System.out.println("===values()===");
		Collection<Integer> values = map.values(); // 중복 가능, 순서 없으므로 객체들의 모임인 Collection이 데이터타입!
		for (Integer v : values) {
			System.out.println(v + "= " + map.get(v));
		}

		System.out.println();
		// entrySet(): <키,객체> 쌍인 객체를 가져와/ <키,객체> 쌍인 객체의 자료형: Map.Entry
		System.out.println("===entrySet()===");
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> e : entrys) {
			System.out.println(e.getKey() + "= " + e.getValue());
		}

		System.out.println();
		// 객체 제거
		System.out.println("객체 제거");
		Integer value = map.remove("홍길동");
		System.out.println(value); //홍길동의 value
		System.out.println(map);
		System.out.println("map의 요소의 개수: " + map.size()); //2

	}

}
