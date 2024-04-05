package chap5;

//command 라인에서 숫자들을 입력받아 각 자릿수의 합 구하기
public class Exam4 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("command 라인에 숫자를 입력하세요");
			return;
		}
		int sum = 0;
		// args: 123 456 78 -> length 3
		// args[0]: 123 -> args[i].length() 123의 길이
		// args[1]: 456
		// args[2]: 789
		//
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i] + " "); // 123
			for (int j = 0; j < args[i].length(); j++) {
				sum += args[i].charAt(j) - '0'; // 순수 숫자값 합계
			}
		}
		System.out.println("의 자리수 합: " + sum);

	}
}
