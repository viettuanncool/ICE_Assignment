package ca.sheridancollege.project.BlackJackClass;


import java.util.ArrayList;
/**
 *
 * @author jbias
 */
public class Hand extends GroupOfCards{
    ArrayList<BJCard> hand;
    
    public Hand (int s){
        super(s);
    }
    
    public void getCard(){
        hand.add(Deck.getCard());
        System.out.println(hand.get(super.getSize()-1).getValue());
    }
}
