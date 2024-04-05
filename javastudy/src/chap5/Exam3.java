package chap5;

//str 문자열 내, 각 소문자의 개수 출력
//소문자만 조회
//개수가 1 이상인 데이터만 출력
//개수만큼 별표 출력
public class Exam3 {

	public static void main(String[] args) {
		String str = "aaabbb124fsdlfsdgljaadslag";

		int[] cnt = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); // i번째에 있는 문자 하나
			if (ch >= 'a' && ch <= 'z') {
				cnt[ch - 'a']++;

			}
		}

		for (int i = 0; i < cnt.length; i++) {

			if (cnt[i] > 0) {
				System.out.print((char) ('a' + i) + ":" + cnt[i] + "개");

				for (int j = 1; j <= cnt[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		}

	}

}
