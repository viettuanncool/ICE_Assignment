package ca.sheridancollege.project.BlackJackClass;

public class Deck extends GroupOfCards{
    
    public Deck(int givenSize) {
        super(givenSize);
        addCards();
        super.shuffle();
    }
    
    private void addCards(){
        int index = 0;
        for(BJCard.Suit suit : BJCard.Suit.values()){
            for(BJCard.Value value: BJCard.Value.values()){
                System.out.println(value + " " + suit);
                showCards().add(new BJCard(suit,value));
                index++;
            }
        }
    }
    
    
    
    
}