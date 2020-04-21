package ca.sheridancollege.project.BlackJackClass;

public class Deck extends GroupOfCards{
    
    private int order;
    
    public Deck(int givenSize) {
        super(givenSize);
        addCards();
        super.shuffle();
        order=0;
    }
    
    private void addCards(){
        int index = 0;
        for(BJCard.Suit suit: BJCard.Suit.values()){
            for(BJCard.Value value: BJCard.Value.values()){
                showCards().add(index, new BJCard(suit,value));
                index++;
            }
        }
    }
    
    public Card getCard(){
        return showCards().get(order);
    }
    
    
}