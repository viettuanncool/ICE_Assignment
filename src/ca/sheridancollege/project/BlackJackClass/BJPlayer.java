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
    
    public BJPlayer(String name){
        super(name);
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
        if(sum>21){
            if(numOfAces>=1){
                sum-=10;
                numOfAces--;
                return false;
            }
            return true;
        }
        else
            return false;
    }
    
    
    @Override
    public void play() {
        hand = new Hand(7);
        sum=0;
        for(int cards=0;cards<2;cards++){
            getCard();
        }
        Scanner in = new Scanner(System.in);
        boolean deal = true;
        hand.printHand();
        while ((!bust()) && deal){
            deal = false;
            System.out.println("Stand or Deal");
            String choice = in.nextLine();
            if(choice.equalsIgnoreCase("deal")){
                getCard();
                hand.printHand();
                deal = true;
            }
        }
    }
}