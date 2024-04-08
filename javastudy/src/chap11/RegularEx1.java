package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규표현식: 문자의 형식을 지정하는 기능
 */
public class RegularEx1 {

	public static void main(String[] args) {
		String[] data = { "bat", "baby", "bonus", "cA", "ca", "co", "c.", "car", "combat", "count", "cTT", "data",
				"disk", "c" };

		// Pattern p=Pattern.compile("c[A-Za-z]?");
		Pattern p = Pattern.compile("c[A-Za-z]+");

		// compile: 번역
		// Pattern: 문자의 형식 지정
		// c[A-Za-z]: c로 시작하고, 뒤에 영문자(대소문자 둘다)가 1개 또는 0개
		// ?: 0 또는 1
		// +: 1개 이상
		// *: 0개 이상

		for (String s : data) {
			Matcher m = p.matcher(s); // 패턴 형식 검증을 위한 객체 
			if (m.matches()) { // 패턴 여부 검증- 설정된 패턴과 일치해? boolean
				System.out.print(s + ", ");
			}
		}
		System.out.println();
		
		String names = "홍길동  ,  김삿갓,  이몽룡, 성춘향,  임꺽정, 향단이    ";
		String[] arr=names.trim().split("\\s*,\\s*");
		// \s*: 공백 0개 이상
		// \s: 공백 1개
		
		
		for(String n:arr) {
			System.out.println("==="+n+"===");
		}

	}

}
