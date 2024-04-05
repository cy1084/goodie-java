package chap11;
/*
 * Object 클래스
 *  - toString 메소드: 객체를 문자열로 변환해주는 메소드/ 참조변수 이름으로 출력하면 자동 호출
 *  - Object 클래스에서는 '클래스명@16진수 해시코드'로 구현
 */

class Card {
	String kind;
	int number;

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Card [kind=" + kind + ", number=" + number + "]";
	}

}

public class ObjectEx3 {
	public static void main(String[] args) {
		Card c1 = new Card("Spade", 1);
		Card c2 = new Card("Spade", 1);

		System.out.printf("10진수: %d, 16진수: %x\n", c1.hashCode(), c1.hashCode());
		System.out.printf("10진수: %d, 16진수: %x\n", c2.hashCode(), c2.hashCode());
		System.out.println(c1); // toString 메소드 자동 호출
		System.out.println(c2);

	}

}
