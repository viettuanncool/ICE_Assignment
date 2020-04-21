package ca.sheridancollege.project.BlackJackClass;


import java.util.ArrayList;
/**
 *
 * @author jbias
 */
public class Hand extends GroupOfCards{
    private ArrayList<BJCard> hand = new ArrayList<BJCard>();
    private Deck deckClass;
    private ArrayList<BJCard> deck;
    
    
    public Hand (int s){
        super(s);
        deckClass = Deck.getInstance();
        deck = deckClass.getDeck();
    } 
    
    public int getCard(){
        hand.add(deck.get(deck.size()-1));
        deck.remove(deck.size()-1);
        return hand.get((hand.size()-1)).getIntValue();
    }
    
    public void printHand(){
        for(int cards=0;cards<hand.size();cards++){
            System.out.println(hand.get(cards).getValue()+" of "+hand.get(cards).getSuit());
        }
    }
}
