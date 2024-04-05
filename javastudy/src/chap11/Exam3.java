package chap11;
/*
 * delChar(원본문자열, 삭제대상문자열)
 * => 원본 문자열에서 삭제 대상 문자열에 속한 문자를 제거하고, 나머지만 출력
 */

public class Exam3 {
	public static void main(String[] args) {
		System.out.println(delChar1("(1!2@3^4~5)", "~!@#$%^&*()")); // 12345
		System.out.println(delChar2("(1!2@3^4~5)", "12345")); // (!@^~)

	}

	// StringBuilder 방법
	private static StringBuilder delChar1(String str1, String str2) {
		StringBuilder sb = new StringBuilder(str1);

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (str2.indexOf(ch) < 0) { // str2에 ch가 있어?
				sb.append(ch); // 없으면 sb에 추가
			}
		}
		return sb;
		// String으로 리턴하고 싶으면 문자열로 바꾸기
		// return sb.toString() 또는 sb+""
	}

	// String 방법
	private static String delChar2(String str1, String str2) {
		String s = "";

		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (!str2.contains(ch + "")) { // contains(String타입 문자열)
				s += ch;
			}
		}
		return s;
	}

}
