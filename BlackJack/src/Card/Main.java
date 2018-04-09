package Card;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Deck deck = new Deck();                    // main에 꼭 하나 나와야한다. 카드가 들어있는 52개의 객체가 하나만 만들어져야한다.
		Card card = new Card();
		Gamer gamer = new Gamer(deck);
		Dealer dealer = new Dealer(deck);
		Rules rule = new Rules();
		
		
		card = deck.card_draw_and_out();
		
//		deck.Card_out();
//		System.out.println(p.toString());
//		System.out.println(deck.choice);
		
		System.out.println(card);
//		System.out.println(dealer.dealer_select_card());
		System.out.println(gamer.gamer_select_card());
//		System.out.println(g.Gamer_draw());
//		
//		System.out.println(p);
//		System.out.println(p);
//		System.out.println(p);
		
	}
}
