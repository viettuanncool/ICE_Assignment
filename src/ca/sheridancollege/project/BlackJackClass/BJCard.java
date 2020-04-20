package ca.sheridancollege.project.BlackJackClass;

public class BJCard extends Card {

	private String suit;
	private int value;

	/**
	 * 
	 * @param String
	 */
	public BJCard(String suit,int value ) {
		// TODO - implement BJCard.BJCard
		throw new UnsupportedOperationException();
	}

	public String getSuit() {
		return this.suit;
	}

	public int getValue() {
		return this.value;
	}

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}