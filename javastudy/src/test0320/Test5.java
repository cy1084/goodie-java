package test0320;

/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test5 {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				sum = sum + i;
			}

		}
		System.out.println("1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수인 숫자의 합은: " + sum);

	}
}
