package chap6;

/*
 * 초기화 블럭 예제
 * static 초기화 블럭
 * - 기능: 클래스 변수의 초기화
 * - 실행 시점: 클래스 정보 로드 시 한번 실행, main 메소드 이전에 실행
 * 인스턴스 초기화 블럭
 * - 기능: 인스턴스 변수의 초기화, 생성자와 기능이 겹쳐 거의 안씀
 * - 실행 시점: 객체화할 때마다 생성자 호출 전에 실행
 * 
 */

public class InitEx1 {
	static int cv;
	int iv;

	InitEx1() {
		System.out.println("5. 생성자 호출됨");
	}

	// static 초기화 블럭
	static { // main보다 먼저 호출
		cv = (int) (Math.random() * 100);
		System.out.println("1.static 초기화 블럭 실행 cv= " + cv);
	}

	// 인스턴스 초기화 블럭- 거의 안씀, 객체 생성할 때마다 호출
	{
		iv = (int) (Math.random() * 100);
		System.out.println("4.인스턴스 초기화 블럭 실행 iv= " + iv);
	}

	public static void main(String[] args) {
		System.out.println("2. main 메소드 시작");
		System.out.println("3. main 메소드에서 init1 객체 생성 cv= " + cv);

		InitEx1 init1 = new InitEx1();
		System.out.println("3. main 메소드에서 init2 객체 생성 cv= " + cv);

		InitEx1 init2 = new InitEx1();
		System.out.println("6. main 메소드 종료");

	}

}
