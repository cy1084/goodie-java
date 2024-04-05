package chap7;

/*
 * final 클래스: 종단 클래스, 변경 불가 클래스, 다른 클래스의 부모 클래스가 될 수 없음, abstract과 반대
 * String, Math 클래스가 final 클래스
 * 
 */

final class Final {

}

//상속 불가, 확장 불가
//class FinalSub extends Final{	
//}

public class FinalClassEx1 {
	public static void main(String[] args) {
		Final f = new Final(); // 객체화는 가능, 변경은 불가

	}

}
