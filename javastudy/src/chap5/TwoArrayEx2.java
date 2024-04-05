package chap5;

public class TwoArrayEx2 {

	public static void main(String[] args) {
		int[][] arr = { { 10, 20 }, { 30, 40 }, { 50, 60 } };

		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr[i].length; j++) { // 열
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ",");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("arr 배열의 행과 열의 합계 출력");

		int[] colSum = new int[arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j]; // 행의 합
				colSum[j] = colSum[j] + arr[i][j];
			}
			System.out.println(i + "행의 합: " + sum);
		}

		for (int i = 0; i < colSum.length; i++) {
			System.out.println(i + "열의 합: " + colSum[i]);
		}
	}

}
