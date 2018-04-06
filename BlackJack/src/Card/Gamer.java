package Card;

import java.util.ArrayList;

public class Gamer {
	Card card;
	Deck deck;
	
	
	public Gamer(Deck d) {
		this.deck = d;
	}
	
	public Card gamer_select_card() {
		Card c =deck.card_draw_and_out();
		return c;
	}
//	
}



//추가로 카드를 받는다.
//뽑은 카드를 소유한다.
//카드를 오픈한다.