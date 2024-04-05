package chap11;
/*
 * Object 클래스
 * - hashCode 메소드: JVM이 객체를 구별하기 위한 고유 값(참조 값)
 * 					 두 객체의 해시코드 값이 동일한 경우는 하나의 객체로 인식
 * 					 물리적으로 같은 객체- 실제로 같은 객체
 * 					 논리적으로 같은 객체- 내용 기준으로 같은 객체인지 판단해야 할 필요성 있음 
 * 									 - a.equals(b)/ a.hashCode()==b.hashCode() => a와 b 객체를 같은 객체로 판단
 * 
 * - 권장사항: equals 메소드를 오버라이딩 하는 경우 hashCode 메소드도 같이 오버라이딩 하도록 권장
 * 
 */

public class ObjectEx2 {
	public static void main(String[] args) {
		String s1 = new String("abc");
		String s2 = new String("abc");

		System.out.println("s1==s2: " + (s1 == s2)); // false
		System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
		System.out.println("s1.hashCode(): " + s1.hashCode());
		System.out.println("s2.hashCode(): " + s2.hashCode());
		System.out.println("s1 객체의 원래 hashCode 값: " + System.identityHashCode(s1));
		System.out.println("s2 객체의 원래 hashCode 값: " + System.identityHashCode(s2));

		System.out.println();
		Equal e1 = new Equal(10);
		Equal e2 = new Equal(10);
		// Equal 클래스에 hashCode 메소드의 내용이 같은 경우 같은 hashCode 값을 리턴하도록 오버라이딩

		System.out.println("e1.hashCode(): " + e1.hashCode());
		System.out.println("e2.hashCode(): " + e2.hashCode());
		System.out.println("e1 객체의 원래 hashCode 값: " + System.identityHashCode(e1));
		System.out.println("e2 객체의 원래 hashCode 값: " + System.identityHashCode(e2));

	}

}
