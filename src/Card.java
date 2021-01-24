public class Card {
    private int card_ID;
    private String card_name;
    private int card_value;

    public void set_card_ID(int id) {
        card_ID = id;
    }

    public void init_cardName() {
        switch (card_ID) {
            case (0) -> card_name = "2 of clubs";
            case (1) -> card_name = "2 of diamonds";
            case (2) -> card_name = "2 of hearts";
            case (3) -> card_name = "2 of spades";
            case (4) -> card_name = "3 of clubs";
            case (5) -> card_name = "3 of diamonds";
            case (6) -> card_name = "3 of hearts";
            case (7) -> card_name = "3 of spades";
            case (8) -> card_name = "4 of clubs";
            case (9) -> card_name = "4 of diamonds";
            case (10) -> card_name = "4 of hearts";
            case (11) -> card_name = "4 of spades";
            case (12) -> card_name = "5 of clubs";
            case (13) -> card_name = "5 of diamonds";
            case (14) -> card_name = "5 of hearts";
            case (15) -> card_name = "5 of spades";
            case (16) -> card_name = "6 of clubs";
            case (17) -> card_name = "6 of diamonds";
            case (18) -> card_name = "6 of hearts";
            case (19) -> card_name = "6 of spades";
            case (20) -> card_name = "7 of clubs";
            case (21) -> card_name = "7 of diamonds";
            case (22) -> card_name = "7 of hearts";
            case (23) -> card_name = "7 of spades";
            case (24) -> card_name = "8 of clubs";
            case (25) -> card_name = "8 of diamonds";
            case (26) -> card_name = "8 of hearts";
            case (27) -> card_name = "8 of spades";
            case (28) -> card_name = "9 of clubs";
            case (29) -> card_name = "9 of diamonds";
            case (30) -> card_name = "9 of hearts";
            case (31) -> card_name = "9 of spades";
            case (32) -> card_name = "10 of clubs";
            case (33) -> card_name = "10 of diamonds";
            case (34) -> card_name = "10 of hearts";
            case (35) -> card_name = "10 of spades";
            case (36) -> card_name = "Jack of clubs";
            case (37) -> card_name = "Jack of diamonds";
            case (38) -> card_name = "Jack of hearts";
            case (39) -> card_name = "Jack of spades";
            case (40) -> card_name = "Queen of clubs";
            case (41) -> card_name = "Queen of diamonds";
            case (42) -> card_name = "Queen of hearts";
            case (43) -> card_name = "Queen of spades";
            case (44) -> card_name = "King of clubs";
            case (45) -> card_name = "King of diamonds";
            case (46) -> card_name = "King of hearts";
            case (47) -> card_name = "King of spades";
            case (48) -> card_name = "Ace of clubs";
            case (49) -> card_name = "Ace of diamonds";
            case (50) -> card_name = "Ace of hearts";
            case (51) -> card_name = "Ace of spades";
        }

        if ((card_ID / 4) + 2 <= 10) {
            card_value = (card_ID / 4) + 2;
        } else if (card_ID <= 47) {
            card_value = 10;
        } else {
            card_value = 11;
        }
    }

    public int get_card_ID() {
        return card_ID;
    }

    public String get_card_name() {
        return card_name;
    }

    public int get_card_value() {
        return card_value;
    }

}
