package ca.sheridancollege.project.BlackJackClass;

public class BJCard extends Card {

	private String suit;
	private int value;

	/**
	 * 
	 * @param String
	 */
	public BJCard(String suit,int value ) {
            this.suit = suit;	
            this.value = value;
        }

	public String getSuit() {
		return this.suit;
	}

	public int getValue() {
		return this.value;
	}

    @Override
    public String toString() {
        return this.value + " of " + this.suit;
    }
}