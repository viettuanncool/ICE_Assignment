package ca.sheridancollege.project.BlackJackClass;

public class BJPlayer extends Player {
    
    int sum;
    BJPlayer(String name){
        super.setPlayerID(name);
        Hand ch = new Hand();
        
        //create 52 Cards
        ch.generateHand();
        
        
        for(BJCard c: ch.cards)
        {
            System.out.println(c.getValue() + " of " + c.getValue());
        }
    }
    @Override public void play (){
        
    }
    public int getSum(){
        return sum;
    }
    public void getCard(){
        int value=0;
        sum+=value;
    }
    
}