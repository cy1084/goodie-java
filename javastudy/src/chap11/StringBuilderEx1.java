package chap11;
/*
 * StringBuilder/StringBuffer 클래스: 동적 문자열 - String 클래스의 보조 역할
 * - 두 개의 클래스는 같은 메소드를 멤버로 가짐
 * - equals 메소드를 오버라이딩 하지 않음
 * 		=> 내용 비교 안됨/ 내용 비교를 위해서는 String(문자열)으로 변경하여 비교함
 * 		=> toString() 으로 문자열로 변환 가능
 */

public class StringBuilderEx1 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb1 == sb2); // false 내용비교 안됨
		System.out.println(sb1.equals(sb2)); // false

		System.out.println(sb1.toString().equals(sb2.toString())); // true

	}

}
