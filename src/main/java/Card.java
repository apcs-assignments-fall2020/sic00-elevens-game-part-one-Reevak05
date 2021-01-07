/**
 * Card.java
 *
 * Card represents a playing card.
 */
public class Card {

	/**
	 * String value that holds the suit of the card
	 */
	private String suit;

	/**
	 * String value that holds the rank of the card
	 */
	private String rank;

	/**
	 * int value that holds the point value.
	 */
	private int pointValue;


   /**
	 * Creates a new Card instance.
	 *
	 * @param cardRank  a String value
	 *                  containing the rank of the card
	 * @param cardSuit  a String value
	 *                  containing the suit of the card
	 * @param cardPointValue an int value
	 *                  containing the point value of the card
	 */
	public Card(String cardRank, String cardSuit, int cardPointValue) {
		// YOUR CODE HERE
		this.rank = cardRank.toLowerCase();
		this.suit = cardSuit.toLowerCase();
		this.pointValue = cardPointValue;
	}


	/**
	 * Accesses this Card's suit.
	 * @return this Card's suit.
	 */
	public String getSuit() {
        // YOUR CODE HERE
        return this.suit;
   }

	/**
	 * Accesses this Card's rank.
	 * @return this Card's rank.
	 */
	public String getRank() {
        // YOUR CODE HERE
        return this.rank;
	}

   /**
	 * Accesses this Card's point value.
	 * @return this Card's point value.
	 */
	public int getPointValue() {
        // YOUR CODE HERE
        return this.pointValue;
	}

	/** Compare this card with the argument.
	 * @param otherCard the other card to compare to this
	 * @return true if the rank, suit, and point value of this card
	 *              are equal to those of the argument;
	 *         false otherwise.
	 */
	public boolean equals(Card otherCard) {
		// YOUR CODE HERE
		if (this.suit.equals(otherCard.getSuit()) && this.rank.equals(otherCard.getRank()) && this.pointValue == otherCard.getPointValue()) return true;
        else return false;
	}

	/**
	 * Converts the rank, suit, and point value into a string in the format
	 *     "[Rank] of [Suit] (point value = [PointValue])".
	 * This provides a useful way of printing the contents
	 * of a Deck in an easily readable format or performing
	 * other similar functions.
	 *
	 * @return a String containing the rank, suit,
	 *         and point value of the card.
	 */
	@Override
	public String toString() {
        // YOUR CODE HERE
        return this.rank + " of " + this.suit + " (" + this.pointValue + " points)";
	}
}
