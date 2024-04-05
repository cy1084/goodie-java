package chap4;

public class LoopEx3 {

	public static void main(String[] args) {
		for (int j = 2; j <= 9; j++) {
			System.out.print(j + "단\t");
		}
		System.out.println("\n");

		for (int j = 2; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println("\n");
		}

	}

}
