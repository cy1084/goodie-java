package chap2;

public class VarEx5 {

	public static void main(String[] args) {
		// 다른 자료형들간의 연산
		// 큰 자료형과 작은 자료형 연산 결과-> 큰 자료형을 쫒아감

		int i1 = 100;
		long l1 = 200;
		long l2 = i1 + l1;
		int i2 = (int) (i1 + l1);
		System.out.println(l2);
		System.out.println(i2);

		// int 보다 작은 자료형의 연산 결과는 int임
		byte b = 10;
		short s = 20;
		// short s2=b+s; 에러, 연산 결과 int이기 때문
		short s2 = (short) (b + s); // short로 형변환 해줘야 함
		System.out.println(s2);

		// String 클래스와의 연산
		// 참조자료형
		// 다른 클래스는 new 예약어로 객체가 생성되지만, String 클래스는 유일하게 대입연산자로도 객체 생성 가능
		// 클래스 중 유일하게 + 연산 가능/ String <= String + 기본 자료형

		String str = "번호";
		System.out.println(1 + 2 + str); // 3번호
		System.out.println(str + 1 + 2); // 번호12
		System.out.println(1 + 2 + ""); // 3
		System.out.println("" + 1 + 2); // 12
		str = "1" + false;
		System.out.println(str);
	}

}
