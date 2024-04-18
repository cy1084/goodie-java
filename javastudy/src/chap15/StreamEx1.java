package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
// Stream은 1회용
// Stream: 대용량 데이터를 처리하기 위한 목적
	
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 90, "경영"),
			new Student("김삿갓", 75, 80, "심리"), 
			new Student("이몽룡", 95, 90, "컴공"), 
			new Student("임꺽정", 65, 70, "전자"),
			new Student("성춘향", 55, 80, "컴공")
		);

	public static void main(String[] args) {
		// list.stream(): list에 있는 것들을 stream 객체로 변경

		Stream<Student> st = list.stream(); // Stream<s>
		// int mathSum = 0;

		st.forEach(s -> { // forEach: 내부 반복자(주로 출력할 때 사용)
			System.out.print(s); // s는 Student 객체

			int sum = s.getEng() + s.getMath();
			double avg = sum / 2.0;
			System.out.printf(", 총점: %3d, 평균: %2f\n", sum, avg);
			// mathSum += s.getMath(); //에러. forEach는 내부 반복자이기 때문에 상수화 시키지 않으면 내부에서 못씀
		});

		System.out.println();
		// Stream은 한번 만들고 한번 반복한 후에는 사라짐
		// 다시 쓰기 위해선 한번 더 만들어야 함
		// IllegatStateException 예외 발생

		System.out.println("수학 점수 총점: " + list.stream().mapToInt(s -> s.getMath()).sum());
		// mapToInt: stream ->IntStream으로 변경
		// sum(): IntStream 내부 요소들의 합
		
		System.out.println("수학 점수 총점: " + list.stream().mapToInt(s -> s.getMath()).sum()); // sum()은 리턴 값 int
		System.out.println("영어 점수 총점: " + list.stream().mapToInt(s -> s.getEng()).sum());
		System.out.println("수학 점수 평균: " + list.stream().mapToInt(s -> s.getMath()).average().getAsDouble());
		System.out.println("영어 점수 평균: " + list.stream().mapToInt(s -> s.getEng()).average().getAsDouble());
		System.out.println("전체 인원 수: " + list.stream().count());// count()는 리턴 값 long

	}

}
