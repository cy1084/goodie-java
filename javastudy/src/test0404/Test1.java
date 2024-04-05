package test0404;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1부터 10까지의 숫자를 입력받아서 숫자만큼 * 가로로 출력하기
 * 99숫자가 입력되면 프로그램 종료하기
 * 입력값이 숫자가 아닌 경우 : InputMismatchException 예외가 발생함
                        숫자만 입력하세요 메세지 출력하고, 다시 입력받기
   입력값이 1~10의 범위가  아닌 경우 : MyInputNumberException 예외를 발생 시키고
                        1 ~ 10까지의 숫자만 입력하세요 메세지 출력하고, 다시 입력받기 
   구동클래스와 MyInputNumberException 예외 클래스 구현하기
 */

class MyInputNumberException extends Exception {
	MyInputNumberException(String msg) {
		super(msg);
	}
}

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("숫자를 입력하세요 ");
		int num;

		while (true) {
			try {
				System.out.println("숫자를 입력하세요 ");
				num = sc.nextInt();
				
				if ((num > 10 || num < 1) && num != 99) {
					throw new MyInputNumberException("1~10 사이의 숫자만 입력하세요");
				} else if (num == 99) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}

				for (int i = 1; i <= num; i++) {
					System.out.print("*");
				}
				System.out.println();

			} catch (InputMismatchException e) {
				System.out.println(sc.next() + "는 숫자가 아닙니다. 숫자만 입력하세요.");
				
			} catch (MyInputNumberException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
