package chap5;

import java.util.Scanner;

//int 값 5개를 저장할 수 있는 배열을 생성하고
//화면에서 5개의 값을 입력받아
//입력받은 수의 합계, 평균, 최대값, 최소값, 최대값의 인덱스, 최소값의 인덱스 출력

public class arrEx1 {
//다시
	public static void main(String[] args) {
		// 개선된 for 문-> 인덱스 사용 불가, 요소의 값만 조회 가능

		int[] nums = new int[5];
		int sum = 0;
		double avg;

		int max = nums[0];
		int min = nums[0];

		// int max=0;-> 이거 아님!
		// int min=0;

		int maxIndex = 0;
		int minIndex = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 정수를 입력하세요");

		for (int i = 0; i < nums.length; i++) {
			nums[i] = sc.nextInt(); // 값 입력
			sum = sum + nums[i];

			if (nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}
			if (nums[i] < min) {
				min = nums[i];
				minIndex = i;

			}
		}

		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double) sum / nums.length);
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
		System.out.println("최대값 인덱스: " + maxIndex);
		System.out.println("최소값 인덱스: " + minIndex);

	}

}
