package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;

import java.util.Collections;

public class Deck extends GroupOfCards{
    
    private static Deck deckClass = new Deck(52);
    private ArrayList<BJCard> deck = new ArrayList<BJCard>();
    
    private Deck(int givenSize) {
        super(givenSize);
        addCards();
        shuffleDeck();
    }
    
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }
    
    public static Deck getInstance(){
        return deckClass;
    }
    
    private void addCards(){
        for(BJCard.Suit suit : BJCard.Suit.values()){
            for(BJCard.Value value: BJCard.Value.values()){
                deck.add(new BJCard(suit, value));
            }
        }
    }
    
    public ArrayList<BJCard> getDeck(){
        shuffleDeck();
        return deck;
    }
    
    
}