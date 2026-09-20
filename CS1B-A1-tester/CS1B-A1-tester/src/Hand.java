public class Hand {

    // Static final class constant
    public static final int MAX_CARDS = 50;
    
    // Private members data
    private Card[] myCards;
    private int numCards;
    
    // Default constructor
    public Hand() {
        resetHand();
    }
    
    // Remove all cards from the hand
    public void resetHand() {
        myCards = new Card[MAX_CARDS];
        numCards = 0;
    }
    
    // Add a card to the hand
    public boolean takeCard(Card card) {
        // If hand is full or card is null, return false
        if (numCards >= MAX_CARDS || card == null) {
            return false;
        }
        
        // Create a deep copy of the card
        Card clonedCard = new Card(card);
        
        // Add the card to the next position
        myCards[numCards] = clonedCard;
        numCards++;
        
        // Return true even if the card was invalid (as per spec)
        return true;
    }
    
    // Play a card from the hand
    public Card playCard() {
        // Return invalid card if hand is empty
        if (numCards == 0) {
            return new Card('0', Card.DEFAULT_SUIT); // Invalid card
        }
        
        // Get card from the top position and decrement counter
        numCards--;
        return myCards[numCards]; // Returns the card at the top position
    }
    
    // Accessor for numCards
    public int getNumCards() {
        return numCards;
    }
    
    // Inspect a specific card in the hand
    public Card inspectCard(int k) {
        // Return invalid card if k is out of bounds
        if (k < 0 || k >= numCards) {
            return new Card('0', Card.DEFAULT_SUIT); // Invalid card
        }
        
        return myCards[k];
    }
    
    // String representation of the hand
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hand =  ( ");
        
        for (int i = 0; i < numCards; i++) {
            sb.append(myCards[i].toString());
            if (i < numCards - 1) {
                sb.append(", ");
            }
        }
        
        sb.append(" )");
        return sb.toString();
    }
}
