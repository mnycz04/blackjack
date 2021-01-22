import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck playedDeck;
        playedDeck = new Deck();

        playedDeck.init();
        Player player = new Player();
        Player dealer = new Player();

        for (int i = 0; i < 2; i++) {
            player.add_card(playedDeck.draw_card());
            dealer.add_card(playedDeck.draw_card());
        }

        boolean player_turn = true;
        while (player_turn) {
            System.out.printf("The dealer has the %s showing.\n\n", dealer.get_cards().get(0).get_card_name());
            System.out.println("You have:");

            for (int i = 0; i < player.get_cards().size(); i++) {
                System.out.println(player.get_cards().get(i).get_card_name());
            }

            System.out.printf("You have %d points.\n", player.get_points());
            System.out.printf("[H] Hit\n[S]Stand\n");

            Scanner choice = new Scanner(System.in);
            String player_choice = choice.nextLine();
            choice.close();

            switch (player_choice) {
                case ("H"):
                    Card drawn_card = playedDeck.draw_card();
                    player.add_card(drawn_card);
                    System.out.printf("\n You drew a %s.\n You now have %d points.", drawn_card.get_card_name(),
                            player.get_points());
                    break;
                case ("S"):
                    player_turn = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    continue;
            }

            if (player.get_points() > 21) {
                player.convert_ace();
                if (player.get_points() > 21) {
                    System.out.println("You busted!");
                    return;
                }
            }
        }

        while (dealer.get_points() < 17) {
            Card drawnCard = playedDeck.draw_card();
            dealer.add_card(drawnCard);

            if (dealer.get_points() > 21) {
                dealer.convert_ace();
            } else {
                System.out.println("The dealer busted!\nYou Won!");
                return;
            }
        }

        if (player.get_points() > dealer.get_points()) {
            System.out.println("You've Won!");
            return;
        } else if (dealer.get_points() == player.get_points()) {
            System.out.println("Push.");
            return;
        } else {
            System.out.println("The dealer wins.");
            return;
        }
    }
}