package chap4;

//1~100 짝수의 합
//for while do while
public class Exam2 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i <= 100; i = i + 2) {
			sum = sum + i;
		}
		System.out.println("합은: " + sum);

		int i = 2;
		int sum2 = 0;
		while (i <= 100) {
			sum2 = sum2 + i;
			i = i + 2;
			//조건문 써도 됨
		}
		System.out.println("합은: " + sum2);

		int sum3 = 0;
		int j = 2;
		do {
			sum3 = sum3 + j;
			j = j + 2;
		} while (j <= 100);

		System.out.println("합은: " + sum3);
	}

}
