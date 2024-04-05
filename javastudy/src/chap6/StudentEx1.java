package chap6;

/*
 * 추상화: 클래스 생성 단계
 * 클래스: 사용자 정의 자료형, 객체 생성 도구-> 객체 지향 언어에서 가장 중요한 개념
 *  - 속성: 멤버필드, 멤버변수
 *  - 기능: 멤버메소드, 멤버함수
 * */

class Student {
	String studNo;
	String name;
	String major;

	void study() {
		System.out.println("공부중");
	}
}

/*
 * new 예약어 기능 
 * - 힙 영역에 메모리 할당(객체 생성) 
 * - 멤버필드값을 기본값으로 초기화 
 * - 생성자 호출 
 * - 대입 연산자를 이용하여 객체의 참조값을 참조변수에 대입
 */

public class StudentEx1 {
	public static void main(String[] args) {
		Student st1 = new Student(); // 객체화, 인스턴스화
		st1.studNo = "A240101";
		st1.name = "홍길동";
		st1.major = "컴공";
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n", st1.studNo, st1.name, st1.major);
		st1.study();

		Student st2 = new Student();
		st2.studNo = "A240102";
		st2.name = "김삿갓";
		st2.major = "경영";
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n", st2.studNo, st2.name, st2.major);
		
		System.out.println();
		st2=st1;
		st1.name="이몽룡";
		System.out.println("st2=st1 이후 실행");
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n", st1.studNo, st1.name, st1.major);
		System.out.printf("학번: %s, 이름: %s, 전공: %s\n", st2.studNo, st2.name, st2.major);
	}

}
