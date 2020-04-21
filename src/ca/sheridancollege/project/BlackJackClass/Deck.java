package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;

public class Deck extends GroupOfCards{
    
    private static Deck deck = null;
    
    private Deck(int givenSize) {
        super(givenSize);
        addCards();
        super.shuffle();
    }
    
    public static Deck getInstance(){
        if(deck ==null){
            deck = new Deck(52);
        }
        return deck;
    }
    
    
    private void addCards(){
        int index = 0;
        for(BJCard.Suit suit : BJCard.Suit.values()){
            for(BJCard.Value value: BJCard.Value.values()){
                System.out.println(value + " " + suit);
                ArrayList<Card> deck1 = showCards();
                deck1.add(new BJCard(suit,value));
                index++;
            }
        }
    }
    
    
    
    
}