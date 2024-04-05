package chap2;

public class VarEx4 {

	public static void main(String[] args) {
		char ch1 = 'A';
		int num = ch1;
		System.out.println("ch1=" + ch1 + ", num=" + num);
		num = ch1 + 1;
		System.out.println("num=" + num + "=>" + (char) num);

		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2); // 결과의 자료형이 int이기 때문에 형변환 연산자가 생략되면 안됨
		System.out.println(b3);

	}

}
