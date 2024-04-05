package chap7;

/*
 * 생성자의 접근 제어자를 private으로 설정 -> 객체를 한 개만 생성함
 */
class SingleObject {
	private static SingleObject obj = new SingleObject();

	private SingleObject() { // 이 생성자는 다른 곳에서 접근 못해! 나만 접근할거야
	};

	int value = 100;

	public static SingleObject getObject() {
		return obj;
	}
}

public class SingletonEx1 {
	public static void main(String[] args) {
		// SingleObject s = new SingleObject(); //접근 제한자 private으로 접근 불가
		// SingleObject.obj private 접근 불가

		SingleObject s1 = SingleObject.getObject();
		SingleObject s2 = SingleObject.getObject();

		System.out.println("s1.value= " + s1.value);
		System.out.println("s2.value= " + s2.value);

		s1.value = 200;
		System.out.println("s1.value= " + s1.value);
		System.out.println("s2.value= " + s2.value);
		// 두 개가 같은 객체

		SingleObject s3 = SingleObject.getObject();
		System.out.println("s3.value= " + s3.value); // 200
	}

}
