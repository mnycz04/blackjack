public class Deck {
    private Card[] deck;

    public void init() {
        deck = new Card[52];

        for (int i = 0; i < 52; i++) {
            Card card;
            card = new Card();
            card.set_card_ID(i);
            card.init_cardName();
            deck[i] = card;
        }
    }

    public Card[] get_deck() {
        return deck;
    }

}
