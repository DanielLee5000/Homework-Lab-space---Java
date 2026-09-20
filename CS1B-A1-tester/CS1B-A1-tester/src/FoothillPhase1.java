/**
 * A simple test class for the Card class. One object of this class represents a
 * complete test session for: - Default card creation - Creating legal and
 * illegal cards - Setting card values to legal and illegal states - Printing
 * card output
 * 
 * This class demonstrates the Card class's constructors, set method, and
 * toString output.
 * 
 * @author Daniel Lee
 */
public class FoothillPhase1
{
    public static void main(String[] args)
    {
        String separator = "\n-------------------------------------------------------\n";
        System.out.println(separator);

        Card card1 = new Card();
        Card card2 = new Card('J', CardInterface.Suit.clubs);

        Card card3 = new Card('Z', CardInterface.Suit.hearts);

        System.out.println(card1);
        System.out.println(card3);
        System.out.println(card2);

        System.out.println();

        card1.set('Y', CardInterface.Suit.diamonds);
        System.out.println(card1);

        card3.set('Q', CardInterface.Suit.spades);
        System.out.println(card3);

        System.out.println(card2);

        System.out.println(separator);
    }
}

/*
 * -------------------------------------------------------
 * 
 * A of spades illegal ** J of clubs
 ** 
 * illegal ** Q of spades J of clubs
 * 
 * -------------------------------------------------------
 */