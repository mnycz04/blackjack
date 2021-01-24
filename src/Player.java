import java.util.ArrayList;

public class Player {
    protected int points = 0;
    private final ArrayList<Card> player_cards = new ArrayList<>();

    public void add_card(Card card) {
        player_cards.add(card);
        points += card.get_card_value();
    }

    public ArrayList<Card> get_cards() {
        return player_cards;
    }

    public int get_points() {
        return points;
    }

    public Boolean convert_ace() {
        for (Card player_card : player_cards) {
            if (player_card.get_card_ID() >= 48) {
                points -= 10;
                player_card.set_card_ID(-1);
                return true;
            }
        }
        return false;
    }
}
