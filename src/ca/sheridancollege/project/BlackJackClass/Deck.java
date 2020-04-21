package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;

public class Deck extends GroupOfCards{
    
    private static ArrayList<BJCard> deck = null;
    
    private Deck(int givenSize) {
        super(givenSize);
        addCards();
        super.shuffle();
    }
    
    public static ArrayList<BJCard> getInstance(){
        if((deck == null)){
        } else {
            deck = new ArrayList<BJCard>(52);
        }
        return deck;
    }
    
    private void addCards(){
        for(BJCard.Suit suit : BJCard.Suit.values()){
            for(BJCard.Value value: BJCard.Value.values()){
                System.out.println(value + " " + suit);
                deck.add(new BJCard(suit, value));
                
            }
        }
    }
    
    
}