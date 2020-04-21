package ca.sheridancollege.project.BlackJackClass;

public class BJCard extends Card {

    enum Suit{
        HEARTS, 
        DIAMONDS,
        CLUBS,
        SPADES
    }
    
    enum Value{
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    }
	private final Suit suit;
        private final Value value;

	/**
	 * 
	 * @param String
	 */
	public BJCard(Suit suit, Value value ) {
              this.suit = suit;
              this.value = value;
        }

	public Suit getSuit() {
		return this.suit;
	}

	public Value getValue() {
		return this.value;
	}

    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }

}
