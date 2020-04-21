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
    
    public int getIntValue(){
        switch (this.value) {
            case ACE:
                return 11;
            case TWO:
                return 2;
            case THREE:
                return 3;
            case FOUR:
                return 4;
            case FIVE:
                return 5;
            case SIX:
                return 6;
            case SEVEN:
                return 7;
            case EIGHT:
                return 8;
            case NINE:
                return 9;
            default:
                return 10;
        }
    }
    
    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }
    
}
