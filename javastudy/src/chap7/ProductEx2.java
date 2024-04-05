package chap7;

/*
 * Buyer 클래스
 */

class Buyer {
	int money = 500;
	int point;
	int cnt;

	Product[] cart = new Product[5];

	void buy(Product p) {
		money = money - p.price;
		point = point + p.point;
		cart[cnt++] = p; // cart에 p 제품 추가, cnt 증가

		System.out.println(p + " 구입"); // p 제품의 이름 출력
	}

	void summary() {
		int totPrice = 0;
		int totPoint = 0;

		// cart 배열 그대로 쓰면 cart에 물품이 다 차지 않은 경우 null 값 발생
		for (int i = 0; i < cnt; i++) {
			totPrice += cart[i].price;
			totPoint += cart[i].point;
		}
		System.out.println("구매제품 전체 가격: " + totPrice);
		System.out.println("구매제품 전체 포인트: " + totPoint);
		
		
		//잔액 출력
		System.out.println("구매 후 잔액: "+money);
		
		//전체 구매 물품 이름 출력
		System.out.print("구매 물품 목록: ");
		
		for (int i = 0; i < cnt; i++) {
			System.out.print(cart[i]+", ");
		}
		System.out.println();
		
		//포인트 출력
		System.out.println("구매 후 포인트: "+point);
	}

}

public class ProductEx2 {
	public static void main(String[] args) {
		Tv tv = new Tv();
		Computer com = new Computer();
		HandPhone hp = new HandPhone();

		Buyer b = new Buyer();
		b.buy(tv);
		b.buy(com);
		b.buy(hp);
		
		b.summary();

	}

}
