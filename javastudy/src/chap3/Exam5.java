package chap3;

import java.util.Scanner;

//사과의 개수를 입력받아 필요한 바구니 수 구하기
//바구니당 10개의 사과 저장 가능
public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사과 개수: ");
		int apple = sc.nextInt();
		int count = 0; // 바구니 개수
		int n = apple / 10;
		int m = apple % 10;

		count += n;

		System.out.println("필요한 바구니 개수: " + ((m != 0) ? (count + 1) : count));
		System.out.printf("필요한 바구니 개수: %d개", ((m != 0) ? (count + 1) : count));

	}

}
