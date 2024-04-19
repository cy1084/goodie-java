package chap15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx8 {
	public static void main(String[] args) {
		List<Student> list1 = Arrays.asList(new Student("홍길동", 70, 80, "경영"), new Student("김길동", 75, 70, "컴공"));
		List<Student> list2 = Arrays.asList(new Student("김삿갓", 90, 88, "경영"), new Student("장영호", 95, 75, "컴공"));

		List<List<Student>> list = new ArrayList<>();
		list.add(list1);
		list.add(list2);

		Stream<Student> st = list.stream().flatMap(s -> s.stream()); //스트림을 이용하여 하나의 리스트로
		/*
		 * s 자료형-> Student를 요소로 가지고 있는 List: List<Student>
		 * s.stream(): Stream<Student>
		 */

		// 영어 점수 합계 출력
		System.out.println(st.mapToInt(s -> s.getEng()).sum());

	}

}
