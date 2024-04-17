package chap14;
/*
 * object2.ser 파일의 객체 복원하기
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object2.ser"));

		User u1 = (User) ois.readObject(); // 객체 읽기
		User u2 = (User) ois.readObject();

		System.out.println("사용자1: " + u1);
		System.out.println("사용자1: " + u2);
		// 부모 변수는 안넘어옴
		// 부모가 Serializable을 구현했다면 자식은 자동으로 구현됨
		// 하지만 자식만 Serializable을 구현했다면 부모는 자동 구현 안됨

	}

}
