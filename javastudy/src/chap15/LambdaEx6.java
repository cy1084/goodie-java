package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Predicate 인터페이스: 매개변수 존재, 리턴 값은 boolean
 * 	Predicate<t>
 * 	boolean test(): 추상 메소드
 */

public class LambdaEx6 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 90, "경영"),
			new Student("김삿갓", 75, 80, "심리"), 
			new Student("이몽룡", 95, 90, "컴공"), 
			new Student("임꺽정", 65, 70, "전자"),
			new Student("성춘향", 55, 80, "컴공")
		);

	public static void main(String[] args) {
		System.out.println("영어 점수가 60 이상인 학생들의 영어 평균: " + avgEng(t -> t.getEng() >= 60));
		// t: Student 타입

		System.out.println("컴공과 학생의 영어 평균: " + comAvgEng(t -> (t.getMajor()).equals("컴공"))); // 여기에 조건이 들어가야 함
	}

	private static double avgEng(Predicate<Student> p) {
		int sum = 0;
		int cnt = 0;

		for (Student s : list) {
			if (p.test(s)) {
				sum += s.getEng();
				cnt++;
			}
		}
		return (double) sum / cnt;
	}

	private static double comAvgEng(Predicate<Student> p) {
		int sum = 0;
		int cnt = 0;

		for (Student s : list) {
			if (p.test(s)) {
				sum += s.getEng();
				cnt++;
			}
		}
		return (double) sum / cnt;
	}

}
