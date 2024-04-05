package chap11;
/*
 * String 클래스의 주요 메소드
 */

public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println("s.charAt(4): " + s.charAt(4)); // E
		// charAt(4): 문자열에서 4번째 인덱스의 문자 리턴

		/*
		 * s.compareTo(문자열): 정렬에 사용되는 메소드 결과 양수: s 문자열이 뒤쪽 결과 음수: s 문자열이 앞쪽
		 */
		System.out.println(s.compareTo("abc")); // -32
		System.out.println(s.compareTo("AAA")); // 1
		System.out.println(s.compareToIgnoreCase("abc")); // 대소문자 상관 없이/ 결과 양수
		System.out.println();

		System.out.println(s.endsWith("GH")); // 문자열 끝이 GH야?
		System.out.println(s.startsWith("GH")); // 문자열이 GH로 시작해?
		System.out.println();

		System.out.println(s.equals("ABCDEFGH"));

		// 대소문자 구분없이
		System.out.println(s.equalsIgnoreCase("abcdefg"));

		System.out.println();
		// s 문자열을 byte형 배열로 리턴
		byte[] arr = s.getBytes();
		for (byte b : arr) {
			System.out.print(b);
		}
		System.out.println();

		char[] carr = s.toCharArray();
		for (char c : carr) {
			System.out.print(c);
		}
		System.out.println();

		// indexOf: 값이 없을 경우 -1 리턴
		s = "This is a String";
		System.out.println("s.indexOf('i'): " + s.indexOf('i'));// 2
		// 가장 처음 만나는 i 문자의 인덱스 값?

		System.out.println("s.indexOf('i',3): " + s.indexOf('i', 3)); // 5
		// 3번째 인덱스 이후(포함) i 문자의 인덱스 값?

		System.out.println("s.indexOf(\"is\"): " + s.indexOf("is")); // 2
		System.out.println("s.lastIndexOf('i'): " + s.lastIndexOf('i')); // 13
		// 뒤부터 i를 찾아줘

		System.out.println();
		System.out.println("s.length(): " + s.length() + "개");

		System.out.println();
		// 문자열 치환
		System.out.println("s.replace('is',''QR): " + s.replace("is", "QR"));
		System.out.println("s.replaceAll('is',''QR): " + s.replaceAll("is", "QR"));

		System.out.println();
		// 부분문자열 substring
		System.out.println("s.substring(5): " + s.substring(5)); // 5번 인덱스 이후(포함)부터 다 가져와
		System.out.println("s.substring(5,13): " + s.substring(5, 13)); // 5번부터 12번 인덱스까지의 값 가져와

		System.out.println();
		// 대소문자 변경
		System.out.println("s.toUpperCase(): " + s.toUpperCase());
		System.out.println("s.toLowerCase(): " + s.toLowerCase());

		System.out.println();
		// 양쪽 공백 제거
		s = "  문자열 trim method  ";
		System.out.println("s.trim():" + s.trim());

		// 문자열 분리
		s = "홍길동,이몽룡,김삿갓"; // 콤마를 기준으로 나눔
		String[] arr1 = s.split(",");
		for (String a : arr1) {
			System.out.println(a);
		}

	}

}
