import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeckOfCards {
    public static void main(String[] args) {
        // Initialize deck of cards
        List<String> suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
        List<String> ranks = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

        List<String> deck = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + " of " + suit);
            }
        }

        // Shuffle the deck
        Random random = new Random();
        for (int i = deck.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap deck[i] and deck[j]
            String temp = deck.get(i);
            deck.set(i, deck.get(j));
            deck.set(j, temp);
        }

        // Distribute 9 cards to 4 players
        int numPlayers = 4;
        int cardsPerPlayer = 9;

        String[][] playersCards = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int player = 0; player < numPlayers; player++) {
            for (int card = 0; card < cardsPerPlayer; card++) {
                playersCards[player][card] = deck.get(cardIndex);
                cardIndex++;
            }
        }

        // Print the cards received by each player
        for (int player = 0; player < numPlayers; player++) {
            System.out.println("Player " + (player + 1) + "'s cards:");
            for (int card = 0; card < cardsPerPlayer; card++) {
                System.out.println(playersCards[player][card]);
            }
            System.out.println();
        }
    }
}