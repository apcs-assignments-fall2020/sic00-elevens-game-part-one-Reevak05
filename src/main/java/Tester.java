/**
 * This is a class that tests the Card and Deck clasees.
 */
public class Tester {

	public static void main(String[] args) {

		//testing Card.java
		Card card1 = new Card("jack", "spades", 0);
		Card card2 = new Card("2", "clubs", 2);
		Card card3 = new Card("jack", "spades", 0);
		System.out.println(card3.equals(card1));
		System.out.println(card3);

		//testing Deck.java
		String[] ranks = {"Ace", "2", "3"};
		String[] suits = {"Clubs", "Hearts"};
		int[] values = {1, 2, 3};
		Deck d1 = new Deck(ranks, suits, values);
		System.out.println(d1);


		String[] ranks2 = {"Ace", "2", "3"};
		String[] suits2 = {"Clubs", "Hearts"};
		int[] values2 = {1, 2, 3};
		Deck d2 = new Deck(ranks2, suits2, values2);
		Card c2 = d2.deal();
		System.out.println(c2);
		System.out.println();
		System.out.println(d2);
	}
}
