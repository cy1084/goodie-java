package chap15;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 관련 인터페이스
 * T getXXX(): 매개변수 없고 리턴 값만 존재
 * 
 * Supplier<T>: T get()-> T형의 리턴값
 * BooleanSupplier: boolean getAsBoolean()
 * DoubleSupplier: double getAsDouble()
 * IntSupplier: int getAsInt()
 * LongSupplier: long getAsLong()
 */

public class LambdaEX3 {
	public static void main(String[] args) {
		Supplier<String> s1 = () -> {
			return "java";
		};
		System.out.println(s1.get());

		IntSupplier s2 = () -> (int) (Math.random() * 6) + 1;
		System.out.println(s2.getAsInt());

		double[] arr = { 1, 1.2, 2.4, 5.3, 10, 3 };
		DoubleSupplier s3 = () -> {
			double sum = 0;
			for (double d : arr) {
				sum += d;
			}
			return sum;

		};

		System.out.println(s3.getAsDouble());

	}
}
