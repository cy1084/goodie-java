package chap8;

abstract class Animal {
	String name;

	Animal(String name) {
		this.name = name;
	}

	abstract void eat();
}

interface Flyable {
	void fly();
}

class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}

	@Override
	void eat() {
		System.out.println(name + ": 벌레를 잡아먹는다.");
	}

	@Override
	public void fly() {
		System.out.println(name + ": 하늘을 날 수 있다.");

	}

}

class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}

	@Override
	void eat() {
		System.out.println(name + ": 나무에서 열매를 따먹는다.");
	}
}

public class InterfaceEx3 {
	public static void main(String[] args) {
		Animal[] a = new Animal[2];
		a[0] = new Dove();
		a[1] = new Monkey();

		for (Animal animal : a) {
			animal.eat();
			// Flyable f=(Flyable)animal; //monkey는 flyable로 형변환 안되므로 에러
			// ClassCastException: 참조변수의 자료형으로 객체 참조가 불가능한 경우 발생 예외

			if (animal instanceof Flyable) {
				Flyable f = (Flyable) animal;
				f.fly();
			}
		}

	}

}
