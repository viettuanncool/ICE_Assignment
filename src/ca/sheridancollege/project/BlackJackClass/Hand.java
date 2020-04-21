package ca.sheridancollege.project.BlackJackClass;


import java.util.ArrayList;
/**
 *
 * @author jbias
 */
public class Hand extends GroupOfCards{
    ArrayList<BJCard> hand;
    private Deck deck;
    
    public Hand (int s){
        super(s);
        deck = new Deck(super.getSize());
    } 
    
    public int getCard(){
        hand.add(deck.getCard());
        return hand.get(super.getSize()-1).getIntValue();
    }
}
