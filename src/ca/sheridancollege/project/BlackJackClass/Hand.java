package ca.sheridancollege.project.BlackJackClass;


import java.util.ArrayList;
/**
 *
 * @author jbias
 */
public class Hand extends GroupOfCards{
    private ArrayList<BJCard> hand;
    private Deck deckClass;
    private ArrayList<BJCard> deck;
    
    
    public Hand (int s){
        super(s);
        deckClass = Deck.getInstance();
        deck = deckClass.getDeck();
    } 
    
    public int getCard(){
        hand.add(deck.get(super.getSize()-1));
        return hand.get(super.getSize()-1).getIntValue();
    }
}
