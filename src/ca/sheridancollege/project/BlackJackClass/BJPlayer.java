/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbias
 */
public class BJPlayer extends Player{
    int sum;
    BJPlayer(String name){
        id=name;
	CardHand ch = new CardHand();
                
        //create 52 Cards
        ch.generateHand();
                
                
        for(Card c: ch.cards)
        {
            System.out.println(c.getValue() + " of " + c.getColour());
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
