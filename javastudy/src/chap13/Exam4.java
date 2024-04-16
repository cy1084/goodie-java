package chap13;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * HashMap 객체에 나라의 수도 등록
 */

public class Exam4 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");

		Scanner sc = new Scanner(System.in);
		// System.out.print("나라 이름을 입력하세요: ");

		/*
		 * while (true) { String nara = sc.next(); if (nara.equals("종료")) { break; }
		 * 
		 * if (nara.equals(map.keySet())) { System.out.println(map.get(values)); } else
		 * System.out.println("등록된 나라가 아닙니다.");
		 * 
		 * 
		 * }
		 */
		while (true) {
			System.out.println("나라 이름을 입력하세요: ");
			String nara = sc.next();
			if (nara.equals("종료")) {
				break;
			}

			String cap = map.get(nara);
			if (cap == null) {
				System.out.println("등록된 나라가 아닙니다. 수도를 입력하세요: ");
				cap = sc.next();
				map.put(nara, cap);
			} else {
				System.out.println(nara + "= " + map.get(nara));
			}

		}

		System.out.println();
		System.out.println("===keySet() 메소드 이용===");
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + "= " + map.get(k));
		}

		System.out.println();
		System.out.println("===Map.Entry() 메소드 이용===");
		for (Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "= " + e.getValue());

		}

	}

}
