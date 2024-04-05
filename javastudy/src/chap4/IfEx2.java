package chap4;

import java.util.Scanner;

//화면에서 문자를 입력받아 대문자, 소문자, 숫자, 기타문자인지 출력
//대문자: ch>='A' && ch<='Z'
//소문자: ch>='a' && ch<='z'
//숫자: ch>='0' && ch<='9'
//그 외 기타문자
public class IfEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력: ");
		char ch = sc.next().charAt(0);
		// next-> 문자열로 인식 ,charAt(0)-> String을 char 타입으로 변환
		// String.charAt(index) 문자열 내에서 index에 해당하는 char 데이터 리턴
		// index는 0부터 시작

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + ":" + "대문자");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + ":" + "소문자");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + ":" + "숫자");
		} else
			System.out.println("기타문자");

	}

}
