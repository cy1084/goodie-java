package chap6;

class Car10 {
	String color; // Car4 인스턴스화 시 변수가 됨-> 인스턴스 변수
	int num;
	int sNo;
	static int cnt; // 클래스 변수

	public String toString() {
		// 객체를 문자열화 하는 메소드
		return "자동차번호: " + sNo + "->" + color + "," + num + ", 자동차 생산 개수: " + cnt;
	}
}

public class StaticValEx1 {
	public static void main(String[] args) {
		Car10 c1 = new Car10();
		c1.color = "white";
		c1.num = 1234;
		c1.sNo = ++Car4.cnt;
		System.out.println(c1); // 참조변수 출력 시 toString() 메소드 자동 호출 =c1.toString

		Car10 c2 = new Car10();
		c2.color = "black";
		c2.num = 5678;
		c2.sNo = ++Car4.cnt;
		System.out.println(c1);
		System.out.println(c2);

	}

}
