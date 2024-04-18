package chap15;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;

/*
 * Operator 인터페이스
 * - Function 인터페이스의 하위 인터페이스
 * - 매개변수, 리턴 값 모두 존재-> 매개변수의 자료형과 리턴값의 자료형이 같다.
 * 
 * IntBinaryOperator: int형 매개변수, int형 리턴 값
 * 					  int applyAsInt(int, int)
 */

public class LambdaEx5 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"), 
			new Student("이몽룡", 85, 75, "통계")
			);

	private static int maxOrMinMath(IntBinaryOperator op) {
		int result = list.get(0).getMath();

		for (Student s : list) {
			result = op.applyAsInt(result, s.getMath());
		}
		return result; // 수학 최대 점수
	}

	private static int maxOrMinEng(IntBinaryOperator op) {
		int result = list.get(0).getEng();

		for (Student s : list) {
			result = op.applyAsInt(result, s.getEng());
		}
		return result;
	}

	private static double maxOrMinAvg(DoubleBinaryOperator op) {
		double result = (list.get(0).getEng() + list.get(0).getMath()) / 2.0;

		for (Student s : list) {
			result = op.applyAsDouble(result, (s.getEng() + s.getMath()) / 2.0);
		}
		return result;
	}

	private static int maxOrMinSum(IntBinaryOperator op) {
		int result = list.get(0).getEng() + list.get(0).getMath();

		for (Student s : list) {
			result = op.applyAsInt(result, s.getEng() + s.getMath());
		}
		return result;
	}

	
	public static void main(String[] args) {
		System.out.print("최대 수학 점수: ");
		System.out.println(maxOrMinMath((a, b) -> (a >= b) ? a : b));

		System.out.print("최소 수학 점수: ");
		System.out.println(maxOrMinMath((a, b) -> (a <= b) ? a : b));

		System.out.print("최대 영어 점수: ");
		System.out.println(maxOrMinEng((a, b) -> (a >= b) ? a : b));

		System.out.print("최소 영어 점수: ");
		System.out.println(maxOrMinEng((a, b) -> (a <= b) ? a : b));

		System.out.print("최대 평균 점수: ");
		System.out.println(maxOrMinAvg((a, b) -> (a >= b) ? a : b));

		System.out.print("최소 평균 점수: ");
		System.out.println(maxOrMinAvg((a, b) -> (a <= b) ? a : b));

		System.out.print("최대 합계 점수: ");
		System.out.println(maxOrMinSum((a, b) -> (a >= b) ? a : b));

		System.out.print("최소 합계 점수: ");
		System.out.println(maxOrMinSum((a, b) -> (a <= b) ? a : b));
	}

}
