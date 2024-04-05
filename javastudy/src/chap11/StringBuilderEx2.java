package chap11;

/*
 * StringBuilder 주요 메소드
 */
public class StringBuilderEx2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc").append(123).append('A').append(false); // 추가
		System.out.println(sb);// abc123Afalse

		sb.delete(2, 4); // 2~(4-1) 제거
		System.out.println(sb);// ab23Afalse

		sb.deleteCharAt(4); // 4번째 인덱스 제거
		System.out.println(sb);// ab23false

		sb.insert(5, "=="); // 5번째 인덱스에 삽입
		System.out.println(sb);// ab23f==alse

		sb = new StringBuilder("ABCDEFG"); // 새로운 객체
		sb.replace(0, 3, "abc"); // 0~(3-1) 인덱스의 문자를 abc로 대체 abcDEFG
		System.out.println();// abcDEFG

		sb.reverse(); // 반대로 출력
		System.out.println(sb); // GFEDcba
	}

}
