package chap11;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx3 {

	public static void main(String[] args) {
		String source = "핸드폰:010-1111-1111,집:02-123-45678" + "이메일:regular222@aaa.bbb,계좌번호:301-01-123456";

		String telPattern = "(0[0-9]{1,2})-(\\d{3,4})-(\\d{4})";
		Pattern p = Pattern.compile(telPattern);
		Matcher m = p.matcher(source);

		int i = 0;
		System.out.println("전화번호===");

		while (m.find()) { // 문자열 내에서 너가 지정한 패턴에 맞는 문자열을 찾아
			System.out.println(++i + ": " + m.group() + "=> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
		}

		i = 0; // 초기화

		System.out.println("이메일===");
		String emailPattern = "(\\w+)@(\\w+).(\\w+)";
		p = Pattern.compile(emailPattern); // 컴파일 다시
		m = p.matcher(source);

		while (m.find()) {
			System.out.println(++i + ": " + m.group() + "=> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
		}

		i = 0;

		System.out.println("계좌번호===");

		String accountPattern = "(\\d{3})-(\\d{2})-(\\d{3})"; 
		p = Pattern.compile(accountPattern);
		m = p.matcher(source);

		while (m.find()) {
			System.out.println(++i + ": " + m.group() + "=> " + m.group(1) + ", " + m.group(2) + ", " + m.group(3));
		}

	}

}
