package Card;

public class Dealer {
	Deck deck;

	
	public Dealer(Deck d) {   // 이걸 왜 이렇게 하는지 알아보자!!! 시
		this.deck = d;
	}
	
	public Card dealer_select_card() {
		Card c = deck.card_draw_and_out();
		return c;
	}
}
	


//추가로 카드를 받는다.
//단, 2카드의 합계 점수가 16점 이하이면 반드시 1장을 추가로 뽑고, 17점 이상이면 받을 수 없다.
//뽑은 카드를 소유한다.
//카드를 오픈한다.