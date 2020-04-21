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
    
   // public int getCard(){
   //     hand.add(Deck.getCard());
    //    return hand.get(super.getSize()-1).getValue();
   // }
}
