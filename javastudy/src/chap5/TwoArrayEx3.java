package chap5;

//arr 배열의 행과 열의 합 출력

public class TwoArrayEx3 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 1, 2, 3, 4, 5 }, { 10, 20 }, { 100 } };

		int maxCol = 0; // 최대 열의 개수
		for (int i = 0; i < arr.length; i++) {
			if (maxCol < arr[i].length) {
				maxCol = arr[i].length;
			}
		}
		System.out.println("arr 배열의 행과 열의 합계 출력");

		int[] colSum = new int[maxCol];
		// = int[] colSum = new int[arr[1].length]; //colSum.length: 5
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j]; // 행의 합
				// colSum[j] = colSum[j] + arr[i][j];
			}
			System.out.println(i + "행의 합: " + sum);
		}

		for (int i = 0; i < colSum.length; i++) {
			System.out.println(i + "열의 합: " + colSum[i]);
		}

	}

}
