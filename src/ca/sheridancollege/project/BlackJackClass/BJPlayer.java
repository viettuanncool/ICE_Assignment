package ca.sheridancollege.project.BlackJackClass;

import java.util.Scanner;

/**
 *
 * @author jbias
 */
public class BJPlayer extends Player{
    private int sum;
    private int numOfAces;
    private Hand hand;
    private final int handSize =7;
    
    public BJPlayer(String name){
        super(name);
        hand = new Hand(7);
    }
    
    public int getSum(){
        return sum;
    }
    
    public void getCard(){
        int value = hand.getCard();
        if(value==11)
            numOfAces++;
        sum+=value;
    }
    
    public boolean bust(){
        if(numOfAces>=1){
            sum-=10;
            numOfAces--;
            return false;
        }
        else
            return true;
    }
    
    @Override
    public void play() {
        Scanner in = new Scanner(System.in);
        boolean deal = false;
        System.out.println("Running "+bust());
        do{
            System.out.println("Stand or Deal");
            String choice = in.nextLine();
            if(choice.equals("deal")){
                getCard();
            } 
        }while ((!bust()) && deal);
    }
}