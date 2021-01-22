import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    // private Card[] deck;
    ArrayList<Card> deck = new ArrayList<>();

    public void init() {

        for (int i = 0; i < 52; i++) {
            Card card;
            card = new Card();
            card.set_card_ID(i);
            card.init_cardName();
            deck.add(card);
        }
    }

    public ArrayList<Card> get_deck() {
        return deck;
    }

    public Card draw_card() {
        int card_ID = ThreadLocalRandom.current().nextInt(0, deck.size());
        Card card = deck.remove(card_ID);
        return card;
    }
}
