package chap15;
/*
 * Java API의 FunctionalInterface
 * - Consumer 관련 인터페이스
 * 		- accept() 추상 메소드: 매개변수 있고, 리턴 값 없음
 * 
 * Consumer<T>: void accept(T)
 * BiConsumer<T,U>: void accept(T,U)
 * DoubleConsumer: void accept(double)
 * IntConsumer: void accept(int)
 * LongConsumer: void accept(long)
 * ObjDoubleConsumer<T>: void accept(Object T,double)
 * ObjIntConsumer<T>: void accept(T,int)
 * ObjLongConsumer<T>: void accept(T,long)
 * 
 */

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class LambdaEx2 {
	public static void main(String[] args) {
		Consumer<String> c1 = t -> System.out.println(t + 8);
		c1.accept("java");

		BiConsumer<String, Double> c2 = (t, u) -> System.out.println(t + u);
		c2.accept("java", 8.0);

		IntConsumer c3 = u -> { // u: int
			int sum = 0;

			for (int i = 1; i <= u; i++) {
				sum += i;
			}
			System.out.println("합: " + sum);
		};

		c3.accept(100);
		c3.accept(10);

	}

}
