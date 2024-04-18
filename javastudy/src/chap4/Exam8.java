package chap4;

import java.util.Scanner;

public class Exam8 {
	/*
	 * i * 위치 
	 * 0 2 => 2-0~2+0 
	 * 1 123 => 2-1~2+1 
	 * 2 01234 => 2-2~2+2
	 * 
	 * 바닥의 개수/2
	 * 
	 * 바닥 개수-> 2*h-1
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이: ");
		int h = sc.nextInt();

		for (int i = 0; i < h; i++) {
			for (int j = 0; j < 2 * h - 1; j++) {
				if (j >= ((2 * h - 1) / 2 - i) && j <= ((2 * h - 1) / 2 + i)) {
					System.out.print("*");
				} else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
