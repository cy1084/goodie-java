package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 점수의 합과 평균 출력
 */
public class Exam5 {

	public static void main(String[] args) {
		String data = "번호:1,이름:홍길동,국어:100,영어:70,수학:85,과학:95,사회:90";

		String scorePattern = "\\d{2,3}";

		Pattern p = Pattern.compile(scorePattern);
		
		//두 가지 방법
		//Matcher m = p.matcher(data);
		Matcher m=p.matcher(data.substring(data.indexOf(",")+1));

		int i = 0;
		int sum = 0;
		float avg = 0;
		int cnt = 0;

		while (m.find()) {
			//if (cnt == 0)
			//	continue;
				
			cnt++;
			System.out.println(m.group()+",");
			sum += Integer.parseInt(m.group());
		}

		System.out.println("점수의 합: " + sum);
		System.out.println("점수의 평균: " + ((float) sum / cnt));

	}

}
