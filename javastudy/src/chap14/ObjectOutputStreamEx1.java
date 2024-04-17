package chap14;
/*
 * ObjectOutputStream
 * - 객체를 외부로 전송할 수 있는 스트림
 * - 외부 전송이 가능한 객체는 Serializable 인터페이스를 구현해야 함
 * 		=> Serializable 구현한 클래스의 객체만 외부 전송 가능-> 직렬화
 * 		=> Serializable을 구현했다는 건 개발자가 이 객체를 외부로 전송해도 된다고 허용한 것
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Customer implements Serializable {
	private String name;
	private transient int age;
	//transient: 직렬화 대상에서 제외되는 멤버변수
	//위에서는 이름만 넘어가고, 나이는 안감(InputStream 할 때 나이 안나옴..)

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + ": " + age;
	}
}

public class ObjectOutputStreamEx1 { // ObjectInputStream과 쌍으로 이루어져있음
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		Customer c1 = new Customer("홍길동", 20);
		Customer c2 = new Customer("김삿갓", 30);
		System.out.println(c1 + ", " + c2);

		oos.writeObject(c1); // 객체 출력
							 // Serializable 인터페이스를 구현한 클래스의 객체만 가능
							 // 구현하지 않으면 NotSerializableException 에러 발생
		oos.writeObject(c2);
		oos.close();

	}

}
