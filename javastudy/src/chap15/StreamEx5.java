package chap15;
/*
 * mapXXX 메소드: 스트림의 요소를 변경하는 메소드
 * - mapToInt: Stream -> IntStream
 * - map: Stream -> 또 다른 Stream
 */

import java.util.Arrays;
import java.util.List;

public class StreamEx5 {
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("홍길동전", "춘향전", "구운몽", "전우치전");

		/*
		 * list.stream(): 리스트의 요소들	=> 요소의 자료형: String
		 * mapToInt(String::length): 리스트 요소들의 자료형, 그것들의 길이	=> 요소의 자료형: int
		 */
		
		
		// 전체 글자의 개수 출력
		System.out.println(list.stream().mapToInt(String::length).sum());
		
		List<Student> list2 = Arrays.asList(
				new Student("홍길동", 55, 90, "경영"),
				new Student("김삿갓", 75, 80, "심리"), 
				new Student("이몽룡", 95, 90, "컴공"), 
				new Student("임꺽정", 65, 70, "전자"),
				new Student("성춘향", 55, 80, "컴공")
			);
		
		//이름만 출력
		list2.stream().map(Student::getName).forEach(System.out::println);
		
		/*
		 * list2.stream(): 요소의 자료형-> Student
		 * map(Student::getName): 요소의 자료형-> String
		 * 
		 * Stream<Student> -> Stream<String>
		 */
		
		
		//영어 점수 목록, 합계 출력
		list2.stream().mapToInt(Student::getEng).forEach(System.out::println);
		// =list2.stream().mapToInt(s->s.getEng()).forEach(System.out::println);
		//forEach는 최종 단계 메소드로 peek처럼 뒤에 뭐가 붙으면 안됨
		
		System.out.println(list2.stream().mapToInt(Student::getEng).sum());
		
		//같이 출력
		System.out.println();
		System.out.println("peek 메소드: 중간단계 메소드");
		System.out.println(list2.stream().mapToInt(s->s.getEng()).peek(s->System.out.print(s+" ")).sum());
		//peek: 중간자
		
		System.out.println();
		//각 학생의 영어, 수학 점수 합계의 목록과 전체 점수 합계 출력
		list2.stream().mapToInt(s->s.getEng()+s.getMath()).forEach(System.out::println);
		System.out.println(list2.stream().mapToInt(s->s.getEng()+s.getMath()).peek(s->System.out.print(s+" ")).sum());
		
		

	}

}
