package chap5;

public class TwoArrayEx {

	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 50;
		arr[2][1] = 60;
		// int[][] arr={{10,20},{30,40},{50,60}}

		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr[i].length; j++) { // 열
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ",");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("1차원 배열 객체 생성");
		int[] arr2 = { 1, 2, 3, 4, 5 };
		arr[1] = arr2;
		for (int i = 0; i < arr.length; i++) { // 행
			for (int j = 0; j < arr[i].length; j++) { // 열
				System.out.print("arr[" + i + "][" + j + "]=" + arr[i][j] + ",");
			}
			System.out.println();
		}

		System.out.println();
		arr2[3] = 5000;
		System.out.println(arr[1][3]);// 5000
	}

}
