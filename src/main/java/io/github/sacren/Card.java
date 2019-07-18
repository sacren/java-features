/**
 * Card class.
 *
 * <p>Private instance data:
 * -suit:Suit
 * -rank:Rank
 *
 * <p>Constructor:
 * +Card(suit:Suit, rank:Rank)
 *
 * <p>Public methods:
 * +getSuit():Suit
 * +getRank():Rank
 * +toString():String
 */
public class Card { /* a single card */
    /* private instance data */
    private Suit suit;
    private Rank rank;

    /** Card constructor with suit and rank. */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /** Card getter for suit. */
    public Suit getSuit() {
        return suit;
    }

    /** Card getter for rank. */
    public Rank getRank() {
        return rank;
    }

    /** Card string method. */
    public String toString() {
        return String.format("%-8s%s", suit, rank);
    }
}
