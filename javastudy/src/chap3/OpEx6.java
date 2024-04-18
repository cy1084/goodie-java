package chap3;

// 대입 연산자
// lvalue(좌측변수)=rvalue(우측값: 변수, 값, 수식)
// x+y=100 (x)
// x=100=y (o)
public class OpEx6 {

	public static void main(String[] args) {

		int num = 200;
		num += 100;
		System.out.println(num);
		num -= 100;
		System.out.println(num);
		num *= 2; // 현재 변수값에 2를 곱해서 다시 num에 대입
		System.out.println(num);
		num /= 10; // 현재 변수값을 10으로 나눠서 다시 num에 대입
		System.out.println(num);
		num %= 3; // 현재 변수값을 3으로 나눈 나머지를 다시 num에 대입
		System.out.println(num);

		byte b = 1;
		b = (byte) (b * 2); // int보다 작은 자료형을 다룰 땐 결과 값 int로 나오기 때문에 byte 형 변환 해줘야 함
		b *= 2; // 이건 형변환 안해줘도 에러 안남, 그냥 현재 변수의 2를 곱하라는 말이기 때문
		// 위 두 문장은 의미는 같으나 같은 문장은 아님

	}

}
