package chap11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 정규 표현식 문자
 * 
 * . : 문자 1
 * ? : 0 또는 1
 * * : 0개 이상
 * + : 1개 이상
 * ^[] : 지정된 문자로 시작되는
 * [^] : 지정된 문자 제외
 * | : 또는 or
 * & : 그리고 and
 * () : 그룹 group
 * \s : 공백
 * \S : 공백이 아닌 문자
 * \w : 일반 문자 [0-9A-Za-z]
 * \W : 특수 문자
 * \d : 숫자 [0-9]
 * \D : 숫자가 아닌 문자
 * {n} : 개수 지정 
 * {n,} : n개 이상
 * {n,n} : n개 이상 n개 이하
 * 
 * 
 */

public class RegularEx2 {

	public static void main(String[] args) {
		String[] patterns = { ".", "[a-z]?", "[0-9]+", "^[0-9]", "[a-z]*", "[a-z]+", "02|010", "\\s", "\\S", "\\d",
				"\\w", "\\W" };
		String[] datas = { "", "a", "1", "12", "012", "abc", "02", " ", "A", "5", "a", "*" };

		for (String d : datas) {
			if (d.equals("")) {
				System.out.print("빈문자열 \"\"의 패턴=>");
			} else if (d.equals(" ")) {
				System.out.print("공백문자 \" \"의 패턴=>");
			} else {
				System.out.print(d + " 문자의 패턴=>");
			}

			for (String p : patterns) {
				Pattern pattern = Pattern.compile(p);
				Matcher m=pattern.matcher(d);
				if(m.matches()) {
					System.out.print(p+", ");
				}
			}
				System.out.println();
			}
		}

	}


