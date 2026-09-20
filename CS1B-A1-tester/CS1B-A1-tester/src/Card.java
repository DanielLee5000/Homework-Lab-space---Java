public class Card implements CardInterface {

    // private members data
    private char value;
    private Suit suit;
    private boolean errorFlag;

    // Static final class constants for default card
    public static final char DEFAULT_VALUE = 'A';
    public static final Suit DEFAULT_SUIT = Suit.spades;

    // Default Constructor
    public Card() {
        this(DEFAULT_VALUE, DEFAULT_SUIT); // Call the constructor with all parameters
    }

    // Constructor with all parameters
    public Card(char value, Suit suit) {
        set(value, suit); // Use the mutator to set value and suit, handles validation
    }

    // Copy Constructor 
    public Card(Card card) {
        if (card != null) {
            // We still use set to ensure validation logic is applied,
            // though a direct copy might seem sufficient if the source is valid.
            // This handles the edge case where someone passes an invalid card
            // to the copy constructor.
            set(card.value, card.suit);
             // Ensure errorFlag state is also copied accurately
            this.errorFlag = card.errorFlag;
        } else {
            // Handle null input gracefully - create an invalid card
            set('0', Suit.spades); // Use an invalid value to trigger errorFlag
            this.errorFlag = true;
        }
    }

    // Constructor with only value parameter (default suit)
    public Card(char value) {
        this(value, DEFAULT_SUIT); // Call the constructor with all parameters
    }

    // Accessors
    @Override
    public Suit getSuit() {
        return suit;
    }

    @Override
    public char getValue() {
        return value;
    }

    @Override
    public boolean isErrorFlag() {
        return errorFlag;
    }

    // Mutator
    @Override
    public boolean set(char value, Suit suit) {
        // Use the helper to validate the value
        if (isValid(value, suit)) {
            this.value = value;
            this.suit = suit;
            this.errorFlag = false;
            return true;
        } else {
            // If invalid, store the values but set the error flag
            this.value = value;
            this.suit = suit;
            this.errorFlag = true;
            return false;
        }
    }

    // toString method
    @Override
    public String toString() {
        if (errorFlag) {
            // Different ways to represent invalid state, matching example:
            return "** illegal **";
            // Alternative: return "[ invalid ]";
        } else {
            // Use the implicit toString() of the enum for the suit name
            return value + " of " + suit;
        }
    }

    // equals method
    @Override
    public boolean equals(Card card) {
        if (card == null) {
            return false;
        }
        // Compare value, suit, and errorFlag status
        return this.value == card.value &&
               this.suit == card.suit &&
               this.errorFlag == card.errorFlag;
    }

    // Private static helper method for validation
    private static boolean isValid(char value, Suit suit) {
        // Suit validation is implicit via the enum type at compile time.
        // We only need to validate the value against the allowed characters.

        // Loop through the valid card values defined in the interface
        for (char validValue : CARD_VALUES) {
            if (value == validValue) {
                return true; // Found a match, it's valid
            }
        }
        // If the loop completes without finding a match, it's invalid
        return false;
    }
}
