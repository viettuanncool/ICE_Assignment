package ca.sheridancollege.project.BlackJackClass;

import java.util.Scanner;

/**
 *
 * @author jbias
 */
public class BJPlayer extends Player{
    private int sum;
    private int numOfAces;
    private Hand ch;
    public BJPlayer(String name){
        super(name);
	ch = new Hand(5);
    }
    
    public int getSum(){
        return sum;
    }
    
    public void getCard(){
        int value = ch.getCard();
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
        BJGame game = new BJGame();
        boolean deal = false;
                do {
                    System.out.println("Stand or Deal");
                    String choice = in.nextLine();
                    if(choice.equals("deal"))
                        game.deal();
                }while (!game.bust(sum) && deal);
    }
}