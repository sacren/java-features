/**
 * Test driver for CardDeck class.
 */
public class TestCard {
    /** CardDeck test driver. */
    public static void main(String[] args) {
        CardDeck deck = new CardDeck();
        System.out.println();
        System.out.println("=== Card deck ===");
        System.out.println();
        System.out.println(deck);
        System.out.println();
        System.out.println("=== Shuffle the deck ===");
        System.out.println();
        deck.shuffle();
        System.out.println(deck);
    }
}
