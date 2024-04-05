package chap7;

/*
 * 다형성 
 */

class Product {
	int price;
	int point;

	Product(int price) {
		this.price = price;
		point = price / 10;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product {
	HandPhone() {
		super(150);
	}

	public String toString() {
		return "HandPhone";
	}
}

public class ProductEx1 {
	public static void main(String[] args) {
		Product[] parr = new Product[3];
		parr[0] = new Tv();
		parr[1] = new Computer();
		parr[2] = new HandPhone();
		// Tv, Computer, HandPhone은 서로 관련이 없음, 독립적

		// product의 가격,포인트 출력하고 합계 출력하기
		int totPrice = 0;
		int totPoint = 0;
		for (Product p : parr) {
			System.out.println(p + ": " + p.price + ", " + p.point);
			//Object에 toString()이 있음
			//p-> p.toString() 자동 호출

			totPrice += p.price;
			totPoint += p.point;
		}
		
		System.out.println("전체 상품 가격: " + totPrice);
		System.out.println("전체 상품 포인트: " + totPoint);

	}

}
