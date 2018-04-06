package Card;

import java.util.Random;
import java.util.ArrayList;

public class Deck {
	
	private static final String Pattern[] = {"spade","heart","diamond","clover"}; 
	private static final String Number[] = {"A","2","3","4","5","6","7","8","9","10","K","J","Q"}; 
	
	ArrayList<Card> BlackJack_deck = new ArrayList();
	Random r = new Random();
	
	
	public Deck() {                   // Deck 만들기
		for(int j = 0; j<Pattern.length; j++) {
			for(int i= 0; i<Number.length; i++) {
				Card c = new Card ();
				c.setPattern(Pattern[j]);
				c.setNumber(Number[i]);
				BlackJack_deck.add(c);
			}
		}
	}
		
	public Card Card_draw_and_out() {
		int choice = r.nextInt(BlackJack_deck.size());
		System.out.println(BlackJack_deck.size());
		Card card_selected = BlackJack_deck.get(choice);
		Card card_removed = BlackJack_deck.remove(choice);
		System.out.println(BlackJack_deck.size());  // size수 확인
		return card_selected;
	}
	//	52개의 서로 다른 카드를 갖고 있다.
	//	카드 1개를 뽑아준다.
}
