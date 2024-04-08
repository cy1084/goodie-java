package test0408;
/*
 * phoneNumArr 에서
 * 전화번호 일부를 입력받아 입력받은 번호를 포함하고 있는 번호를 찾기
   q를 입력받을때 까지 계속 반복하기
   
[결과]   
찾고자 하는 번호를 입력하세요(종료:q)
02
02-3456-7890
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
1234
051-1234-5678
02-1234-7890
찾고자 하는 번호를 입력하세요(종료:q)
q
 */

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		String[] phoneNumArr = { "02-3456-7890", "053-2456-7980", "088-2346-9870", "013-3456-7890", "051-1234-5678",
				"02-1234-7890" };

		Scanner sc = new Scanner(System.in);
		int number;
		while (true) {
			System.out.println("찾고자 하는 번호를 입력하세요(종료:q)");
			number = sc.nextInt();
			
			
		}

	}
}
