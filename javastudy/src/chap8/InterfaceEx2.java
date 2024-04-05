package chap8;

//인터페이스 간 상속은 다중 상속 가능
interface Complexerable extends Printerable, Scannerable, Faxable {

}

class Complexer2 implements Complexerable {
	int ink;

	Complexer2() {
		ink = INK;
	}

	@Override
	public void print() {
		System.out.println("프린트 출력. 남은 잉크량: " + --ink);
	}

	@Override
	public void scan() {
		System.out.println("이미지 스캔.");
	}

	@Override
	public void send(String no) {
		System.out.println(FAX_NO + "에서 " + no + " 로 FAX 보냄.");
	}

	@Override
	public void receive(String no) {
		System.out.println(no + "에서 " + FAX_NO + "로 FAX 받음.");
	}

}

public class InterfaceEx2 {

	public static void main(String[] args) {
		System.out.println("기본 잉크량: " + Printerable.INK);
		System.out.println("기본 잉크량: " + Complexerable.INK);
		System.out.println("기본 잉크량: " + Complexer.INK);
		System.out.println("기본 잉크량: " + Complexer2.INK);

		System.out.println("FAX 번호: " + Faxable.FAX_NO);
		System.out.println("FAX 번호: " + Complexerable.FAX_NO);
		System.out.println("FAX 번호: " + Complexer.FAX_NO);
		System.out.println("FAX 번호: " + Complexer2.FAX_NO);

		Complexer2 comp = new Complexer2();
		if (comp instanceof Complexerable) {
			System.out.println("comp 객체는 Complexerable 형으로 형변환 가능");
			Complexerable c = comp;
			c.print();
			c.scan();
			c.receive("02-2222-3333");
			c.send("02-2222-3333");

			System.out.println(c.FAX_NO);
			System.out.println(comp.ink);
			// System.out.println(c.ink);
		}
	}

}
