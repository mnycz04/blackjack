import java.util.ArrayList;

public class Player {
    private int points = 0;
    private ArrayList<Card> player_cards = new ArrayList<>();

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

    public void convert_ace() {
        for (int i = 0; i < player_cards.size(); i++) {
            if (player_cards.get(i).get_card_ID() >= 48) {
                points -= 10;
            }
        }
    }
}
