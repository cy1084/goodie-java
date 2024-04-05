package test0326;

/*1. Card 클래스가 다음과 같을때 구동 클래스를 완성하시오

[결과]
Heart:1(100,250)
Spade:1(100,250)
Heart:1(50,80)
Spade:1(50,80)
*/
class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}

public class Test3 {
	public static void main(String[] args) {
		Card c1=new Card();
		c1.kind="Heart";
		c1.number=1;
		System.out.println(c1.toString());
		
		Card c2=new Card();
		c2.kind="Spade";
		c2.number=1;
		System.out.println(c2.toString());
		
		c1.width=50;
		c1.height=80;
		System.out.println(c1.toString());
		
		c2.width=50;
		c2.height=80;
		System.out.println(c2.toString());
	}
}