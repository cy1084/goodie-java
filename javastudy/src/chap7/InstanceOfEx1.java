package chap7;

/*
 * instanceof 연산자: 단항 연산자
 * - 객체와 참조변수 사이의 관계 리턴(형 변환 가능 여부 확인)
 * - 반환 타입: boolean 형
 * - 부모 틀래스의 객체를 자식 클래스 타입
 * 의 참조변수로 참조 불가(ClassCastException 예외 발생- 실행 시 에러)
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent2 p = new Child2();
		// Child2 c = (Child2) p;

		if (p instanceof Child2) {
			System.out.println("p 참조변수가 참조하는 객체는 Child2 객체임");
			Child2 c = (Child2) p;
		}

		if (p instanceof Parent2) {
			System.out.println("p 참조변수가 참조하는 객체는 Parent2 객체임");
			Parent2 p2 = p;
		}

		if (p instanceof Object) {
			System.out.println("p 참조변수가 참조하는 객체는 Object 객체임");
			Object o = p;
		}
	}

}
