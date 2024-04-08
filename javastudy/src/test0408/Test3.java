package test0408;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2024-01-03
2024-01-03 -2024-01-01 일자의 차이 : 2  
 */
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd).");
		String s1 = sc.nextLine();
		System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd).");
		String s2 = sc.nextLine();

		String sPattern = "(\\d{4})-(\\d{1,2})-(\\d{1,2})";
		Pattern p = Pattern.compile(sPattern);
		Matcher m1 = p.matcher(s1);
		Matcher m2 = p.matcher(s2);

		int i = 0;
		while (m1.find()) {
			System.out.println(m1.group(3));
		}

		i = 0;
		while (m2.find()) {
			System.out.println(m2.group(3));
		}

		int cha = (Integer.parseInt(m2.group(3))) - (Integer.parseInt(m1.group(3)));
		System.out.println("일자의 차이: " + cha);

	}
}
