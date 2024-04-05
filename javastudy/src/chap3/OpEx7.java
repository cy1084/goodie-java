package chap3;

public class OpEx7 {

	public static void main(String[] args) {
		int num = 100;
		System.out.printf("%d\n", num);
		System.out.printf("%10d\n", num);
		// 10진 정수를 최소 10자리 오른쪽 정렬로 출력
		
		System.out.printf("%-10d\n", num);
		// 10진 정수를 최소 10자리 왼쪽 정렬로 출력
		
		System.out.printf("%-,10d, %-,10d\n", num, 12345);
		// 10진 정수를 최소 10자리 왼쪽 정렬로 ,도 출력
		
		System.out.printf("%010d\n", num);
		// 10진 정수를 최소 10자리 오른쪽 정렬로, 빈자리는 0으로 채워 출력

	}

}
