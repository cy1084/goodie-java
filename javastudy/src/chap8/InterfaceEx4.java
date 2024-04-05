package chap8;

//인터페이스형을 리턴 타입으로 사용

class Lazerzet implements Printerable {
	@Override
	public void print() {
		System.out.println("레이저젯 프린터로 프린트함");
	}
}

class Inkzet implements Printerable {
	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트함");
	}
}

class PrinterManager {
	// Printerable 리턴: Printerable 인터페이스의 구현클래스를 리턴
	public static Printerable getPrint(String type) {
		if (type.equals("INK")) {
			return new Inkzet();
		} else
			return new Lazerzet();
	}
}

public class InterfaceEx4 {
	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrint("INK");
		p.print(); // 잉크젯
		p = PrinterManager.getPrint("LAZER");
		p.print(); // 레이저젯
	}

}
