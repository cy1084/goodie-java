package chap15;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/*
 * IntStream 
 * - int 형 값들의 모임
 * 
 */

public class StreamEx2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println("Arrays.stream 메소드를 이용하여 IntStream 생성");
		IntStream is1 = Arrays.stream(arr);

		is1.forEach(System.out::println); // 메소드 참조 방식
		// is1.forEach(s -> System.out.print(s)); // 위와 같음

		// 합계 출력
		System.out.println("is1의 합: " + Arrays.stream(arr).sum()); // 스트림 다시 생성 후 합계 구해야 함-> 일회용
																	// is1.sum() 에러

		System.out.println("IntStream.of 메소드를 이용하여 IntStream 생성");
		IntStream.of(arr).forEach(s -> System.out.print(s));
		System.out.println();

		System.out.println("IntStream.range 메소드를 이용하여 IntStream 생성");
		IntStream.range(1, 10).forEach(s -> System.out.print(s)); // 10 전까지
		System.out.println();

		System.out.println("IntStream.rangeClosed 메소드를 이용하여 IntStream 생성");
		IntStream.rangeClosed(1, 10).forEach(s -> System.out.print(s)); // 10 포함
		System.out.println();

		System.out.println();
		// 1부터 100까지 짝수의 합
		System.out.println("1부터 100까지 짝수의 합: " + IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum());

		System.out.println();
		// 1부터 100까지 짝수들의 평균
		System.out.println(
				"1부터 100까지 짝수들의 평균: " + IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).average().getAsDouble());

		System.out.println();
		// 1~10 사이의 난수 5개 생성
		new Random().ints(5, 1, 11).forEach(s -> System.out.print(s + ", "));
		// IntStream is2=new Random().ints(5,1,11);
		// is2.forEach(s->System.out.print(s+", "));

		System.out.println();
		// IntStream을 배열로 만들기
		int[] arr2 = new Random().ints(5, 1, 11).toArray();
		for (int i : arr2) {
			System.out.print(i + ", ");
		}
		
		
	}
}
