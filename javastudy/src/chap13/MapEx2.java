package chap13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * EastCard 클래스 구현
 * 일의 자리 숫자가 큰 수가 이김
 */

//다시
//EastCard 클래스
class EastCard {
	final int num;
	final boolean isKwang;

	public EastCard(int num, boolean isKwang) {
		super();
		this.num = num;
		this.isKwang = isKwang;
	}

	public String toString() {
		return num + ((isKwang) ? "K" : "");
	}
}

class CardDeck {
	List<EastCard> cards;
	static Map<String, Integer> jokbo;
	static {
		jokbo = new HashMap<>();

		// 광땡
		jokbo.put("KK", 4000);
		for (int i = 1; i <= 10; i++) {
			jokbo.put("" + i + i, 3000 + (i * 10));
		}

		jokbo.put("12", 2060);
		jokbo.put("21", 2060);
		jokbo.put("14", 2050);
		jokbo.put("41", 2050);
		jokbo.put("19", 2040);
		jokbo.put("91", 2040);
		jokbo.put("110", 2030);
		jokbo.put("101", 2030);
		jokbo.put("410", 2020);
		jokbo.put("104", 2020);
		jokbo.put("46", 2010);
		jokbo.put("64", 2010);
	}

	CardDeck() {
		cards = new ArrayList<>();
		for (int i = 0; i < 20; i++) { // 카드 20장
			cards.add(new EastCard(i % 10 + 1, ((i == 0 || i == 2 || i == 7) ? true : false)));
		}
		System.out.println(cards);
	}

	// 카드 섞기
	public void shuffle() {
		Collections.shuffle(cards); // 실행할 때마다 카드 섞음
		System.out.println(cards);
	}
	
	//무슨 함수..............
	public EastCard pick(int i) {
		return cards.remove(i);
		//값이 Player에게로 넘어감
	}

	
}

//Player 클래스
class Player {
	String name;
	EastCard card1, card2;

	Player(String name, EastCard card1, EastCard card2) {
		this.name = name;
		this.card1 = card1;
		this.card2 = card2;
	}

	int getScore() {
		Integer score = 0;
		//int에는 null을 넣을 수 없지만 Integer는 null을 처리할 수 있음 

		if (card1.isKwang && card2.isKwang) { // card1과 card2가 둘다 광인 경우
			score = CardDeck.jokbo.get("KK");
		} else {
			score = CardDeck.jokbo.get("" + card1.num + card2.num);
			if (score == null) { // 족보에 없는 카드인 경우
				score = (card1.num + card2.num) % 10;
			}
		}
		return score;
	}

	public String toString() {
		return name+"("+card1+", "+card2+"): "+getScore(); 
					
	}
}

public class MapEx2 {
	public static void main(String[] args) {
		CardDeck deck = new CardDeck();
		deck.shuffle();
		
		List<Player> list=new ArrayList<>();
		list.add(new Player("홍길동", deck.pick(0), deck.pick(0)));
		list.add(new Player("김삿갓", deck.pick(0), deck.pick(0)));
		list.add(new Player("이몽룡", deck.pick(0), deck.pick(0)));
		//deck.pick(0)- 제일 앞에 있는 카드 전달 
		
		for(Player p:list) {
			System.out.println(p);
		}
		System.out.println("deck에 남은 카드 개수: "+deck.cards.size()); //14
		
		
		//Player 중 점수가 가장 높은 사람이 승리(정렬)
		Collections.sort(list,(p1,p2)->p2.getScore()-p1.getScore());
		System.out.println(list);
		if(list.get(0).getScore()==list.get(1).getScore()) {
			System.out.println("비김");
		}else {
			System.out.println(list.get(0).name+" 승리!");
		}
		
		
		 

	}

}
