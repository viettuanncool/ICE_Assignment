package ca.sheridancollege.project.BlackJackClass;


import java.util.ArrayList;
/**
 *
 * @author jbias
 */
public class Hand extends GroupOfCards{
    ArrayList<BJCard> hand;
    private ArrayList<BJCard> deck;
    
    public Hand (int s){
        super(s);
        deck = Deck.getInstance();      
    } 
    
    public int getCard(){
        hand.add(deck.get(super.getSize()-1));
        return hand.get(super.getSize()-1).getIntValue();
    }
}
