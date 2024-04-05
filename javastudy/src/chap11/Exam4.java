package chap11;

//숫자들의 합을 계산하기
public class Exam4 {

	public static void main(String[] args) {
		String str = "10,20,30,40,50";
		String[] arr = str.split(",");
		int sum = 0;

		for (String s : arr) {
			sum += Integer.parseInt(s.trim());
		}
		System.out.println(str + "의 합: " + sum);
	}

}
