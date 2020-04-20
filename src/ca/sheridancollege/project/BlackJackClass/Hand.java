package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;

public class Hand {
    
    private ArrayList<BJCard> _card = new ArrayList<BJCard>();
    
    public Hand() {
        // TODO - implement Hand.Hand
        throw new UnsupportedOperationException();
    }
    
    public int addCard(BJCard card){
        _card.add(card);
        return card.getValue();
    }
    
    
}