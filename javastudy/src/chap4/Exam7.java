package chap4;

import java.util.Scanner;
/*
 * 삼각형의 높이를 입력받아서 * 로 삼각형 출력하기
 * [결과]
 * 삼각형의 높이 : 3
 *   
        i   *위치     
   ***  1   1,2,3
    **  2   2,3
     *  3   3 
 */
public class Exam7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("삼각형의 높이: ");
		int h = sc.nextInt();

		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= h; j++) {
				if (i <= j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
