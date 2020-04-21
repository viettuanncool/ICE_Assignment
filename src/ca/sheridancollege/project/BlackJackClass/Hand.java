package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;

public class Hand {
    
    private ArrayList<BJCard> _card = new ArrayList<BJCard>();
    
    public Hand() {
        // TODO - implement Hand.Handk
    }
    
    public int addCard(BJCard card){
        _card.add(card);
        return card.getValue();
    }

    void addCard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}