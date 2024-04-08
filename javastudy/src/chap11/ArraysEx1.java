package chap11;
/*
 * Arrays 클래스: 배열의 복사, 비교, 정렬 기능 등을 포함하고 있는 클래스
 */

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx1 {
	public static void main(String[] args) {
		String[] arr1 = { "홍길동", "이몽룡", "성춘향", "향단이" };
		for (String s : arr1) {
			System.out.print(s + ", ");
		}
		System.out.println();

		// arr1 배열의 모든 요소 값을 김길동으로 채우기
		Arrays.fill(arr1, "김길동");

		for (String s : arr1) {
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1)); // for문 안써도 배열의 요소 출력

		// arr1 배열 1,2 인덱스의 값을 홍길동전으로 변경하기
		Arrays.fill(arr1, 1, 3, "홍길동전");
		System.out.println(Arrays.toString(arr1));

		// arr1 배열의 값 정렬하기
		Arrays.sort(arr1);// 오름차순
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1, Comparator.reverseOrder());// 내림차순
		System.out.println(Arrays.toString(arr1));

		// arr1 배열의 값 복사하기
		String[] arr2 = Arrays.copyOf(arr1, arr1.length);
		arr2[1] = "이몽룡";
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		// numArr의 모든 요소 값을 10으로 저장
		int[] numArr = new int[100];
		Arrays.fill(numArr, 10);
		System.out.println(Arrays.toString(numArr));

	}

}
