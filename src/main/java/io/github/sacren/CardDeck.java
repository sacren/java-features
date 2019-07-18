/**
 * CardDeck class for a whole deck of cards.
 *
 * <p>Private instance data:
 * -deck:List<Card>
 *
 * <p>Constructor:
 * +CardDeck()
 *
 * <p>Public methods:
 * +set():void
 * +shuffle():void
 * +toString():String
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {
    /* private instance data */
    List<Card> deck;

    /** CardDeck constructor. */
    public CardDeck() {
        set();
    }

    /** CardDeck setter for the whole deck. */
    public void set() {
        deck = new ArrayList<Card>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    /** CardDeck method to shuffle the cards. */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /** CardDeck string method. */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : deck) {
            sb.append(card);
            sb.append(String.format("%n"));
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
