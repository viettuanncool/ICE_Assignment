package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;

public class Deck extends GroupOfCards{
    
    private static ArrayList deck = new ArrayList<BJCard>(52);
    
    private Deck(int givenSize) {
        super(givenSize);
        addCards();
        super.shuffle();
    }
    
    public static ArrayList<BJCard> getInstance(){
        return deck;
    }
    
    private void addCards(){
        int index = 0;
        for(BJCard.Suit suit : BJCard.Suit.values()){
            for(BJCard.Value value: BJCard.Value.values()){
                System.out.println(value + " " + suit);
                Deck.getInstance().add(new BJCard(suit, value));
                index++;
            }
        }
    }
    
    
}