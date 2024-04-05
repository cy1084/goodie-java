package chap2;

public class VarEx3 {

	// 기본 자료형과 참조 자료형은 형변환 불가(Wrapper class는 가능)
	// 자동 형변환(형변환 연산자 생략 가능) vs 명시적 형변환
	// 자동 형변환: 작은 자료형-> 큰 자료형
	// 명시적 형변환: 큰 자료형-> 작은 자료형
	// 자료형 크기 순서
	// byte - short,char - int - long - float! - double

	public static void main(String[] args) {
		byte b = 10;
		b = (byte) 257; // 명시적 형변환, byte 생략하면 에러

		char c = (char) b; // char 예외(char는 부호비트가 없고 byte는 있기 때문)
		// byte, short와 char 사이는 예외
		// 외울 필요 없고 오류나면 명시적 자료형 써주기

		// 실수형 리터럴의 자료형은 double
		float f = (float) 1.0; // 그러므로 앞에 float 써줘야 함
		f = 10.1F;

		double l = 4000L;

	}

}
