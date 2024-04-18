package chap15;
/*
 * Filter 메소드 
 * - Stream의 요소 중 조건에 맞는 요소들로 Stream 요소 선택
 */

import java.util.Arrays;
import java.util.List;

public class StreamEx4 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "김삿갓", "홍길동", "임꺽정", "홍길동", "김자바", "박자바");

		// list 요소를 중복 제거 후 출력
		list.stream().distinct().forEach(System.out::println);

		System.out.println();
		// list 요소의 성이 홍씨인 요소 출력
		list.stream().filter(s -> s.startsWith("홍")).forEach(System.out::println);

		System.out.println();
		// list 요소의 성이 홍씨인 요소를 중복없이 출력
		list.stream().distinct().filter(s -> s.startsWith("홍")).forEach(System.out::println);
		
		System.out.println();
		// list 요소 중 이름이 자바인 요소를 중복없이 출력
		list.stream().distinct().filter(s -> s.endsWith("자바")).forEach(System.out::println);
		
		System.out.println();
		// list 요소 중 이름이 자바인 요소의 개수 출력		
		System.out.println(list.stream().distinct().filter(s -> s.endsWith("자바")).count());

	}

}
