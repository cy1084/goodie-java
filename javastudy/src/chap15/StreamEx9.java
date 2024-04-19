package chap15;

import java.util.Arrays;
import java.util.stream.Stream;

/*
 * boxed 메소드: IntStream => Stream<Integer>
 * 	asLongStream(): IntStream => LongStream
 * 	asDoubleStream(): IntStream => DoubleStream
 */

public class StreamEx9 {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60 };
		System.out.println("IntStream => Stream<Integer>");
		Stream<Integer> st = Arrays.stream(arr).boxed();
		st.forEach(i -> System.out.print(i.hashCode() + " "));

		System.out.println();
		Integer arr2[] = { 10, 20, 30, 40, 50, 60 };
		Arrays.stream(arr2).forEach(i -> System.out.print(i.hashCode() + " "));

		System.out.println();
		System.out.println("Stream<Integer> => IntStream");
		// System.out.println("arr2 배열의 합: "+Arrays.stream(arr2).sum()); //에러
		System.out.println("arr2 배열의 합: " + Arrays.stream(arr2).mapToInt(a -> a.intValue()).sum());
		// mapToInt(a->a) Integer a를 int a로 바꿔

		System.out.println();
		System.out.println("IntStream => DoubleStream");
		Arrays.stream(arr).asDoubleStream().forEach(a -> System.out.print(a + " "));
	}

}
