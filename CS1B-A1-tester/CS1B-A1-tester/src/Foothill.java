public class Foothill {
    public static void main(String[] args) {
        // Create a line separator for cleaner output
        String separator = "\n-------------------------------------------------------------------------\n";
        
        // Create 3 explicit Card objects (representing our "deck")
        Card card1 = new Card('3', CardInterface.Suit.clubs);
        Card card2 = new Card('T', CardInterface.Suit.clubs);
        Card card3 = new Card('9', CardInterface.Suit.hearts);
        
        // Create one Hand object
        Hand hand = new Hand();
        
        // Use takeCard() in a loop to populate the hand until maximum is reached
        boolean result = true;
        while (result) {
            // Try to add card1, if successful, try card2, then card3
            // This will create many duplicates as required
            result = hand.takeCard(card1);
            if (!result) {
                System.out.println("Hand full");
                break;
            }
            
            result = hand.takeCard(card3);
            if (!result) {
                System.out.println("Hand full");
                break;
            }
            
            result = hand.takeCard(card2);
            if (!result) {
                System.out.println("Hand full");
                break;
            }
        }
        
        // Display the hand
        System.out.println("After deal");
        System.out.println(hand);
        
        // Test inspectCard() with both legal and illegal arguments
        System.out.println("\nTesting inspectCard()");
        System.out.println(hand.inspectCard(2)); // Legal - should display "9 of hearts"
        System.out.println(hand.inspectCard(100)); // Illegal - out of bounds
        
        // Play each card in a loop until hand is empty
        Card playedCard;
        while (hand.getNumCards() > 0) {
            playedCard = hand.playCard();
            System.out.println("Playing " + playedCard);
        }
        
        // Display the now empty hand
        System.out.println("\nAfter playing all cards");
        System.out.println(hand);
    }
}

/* Output from running FoothillPhase1:
-------------------------------------------------------
A of spades
** illegal **
J of clubs

** illegal **
Q of spades
J of clubs
-------------------------------------------------------
*/

/* Output from running Foothill:
-------------------------------------------------------------------------
Hand full
After deal
Hand =  ( 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs, T of clubs, 9 of hearts, 3 of clubs )

Testing inspectCard()
9 of hearts
** illegal **
Playing 3 of clubs
Playing 9 of hearts
Playing T of clubs
[... additional "Playing" lines omitted for brevity ...]
Playing 3 of clubs

After playing all cards
Hand =  (  )
----------------------------------------------------------------------- */
