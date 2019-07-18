/**
 * CardDeck class.
 *
 * <p>Private instance data:
 * -deck:List<Card>
 *
 * <p>Constructor:
 * +CardDeck()
 *
 * <p>Public methods:
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
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
