package chap15;
/*
 * 각 학생들의 과목별 총점과 평균 구하기
 * 수학 점수 총점, 영어 점수 총점 구하기
 */

import java.util.Arrays;
import java.util.List;

public class Exam1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 55, 90, "경영"),
			new Student("김삿갓", 75, 80, "심리"), 
			new Student("이몽룡", 95, 90, "컴공"), 
			new Student("임꺽정", 65, 70, "전자"),
			new Student("성춘향", 55, 80, "컴공")
		);

	public static void main(String[] args) {
		int mathSum = 0;
		int engSum = 0;

		for (Student s : list) {
			System.out.print(s);
			System.out.printf(", 총점: %-4d, 평균: %.2f\n", s.getEng() + s.getMath(), (s.getEng() + s.getMath()) / 2.0);
			mathSum += s.getMath();
			engSum += s.getEng();
		}

		System.out.println("수학 점수 총점: " + mathSum);
		System.out.println("영어 점수 총점: " + engSum);
		System.out.println("수학 점수 평균: " + ((double) mathSum / list.size()));
		System.out.println("영어 점수 평균: " + ((double) engSum / list.size()));

	}

}
