package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;
import java.util.Scanner;


public class BJGame extends Game {
    private BJPlayer [] _player;
    private int size;
    private int [] _score;
    private Hand [] _hand;
    private int _endScore;
    
    public BJGame(){
        super("Black Jack");
    }
    
    public boolean bust(int turn) {
        boolean bust = true;
        if (_player[turn].getSum() > 21) {
            bust = false;
        }
        return bust;
    }
    
    public void deal() {
        // TODO - implement BJGame.deal
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void play() {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the amount of players");
        size = in.nextInt()+1;
        System.out.println("Enter the score you want to finish on");
        _endScore = in.nextInt();
        _player = new BJPlayer[size];
        _hand = new Hand[size];
        _score = new int [size];
        
        for(int turn = 0; turn<size; turn++){
            System.out.println("Player "+turn+", enter your name. ");
            String name = in.nextLine();
            _player[turn]= new BJPlayer(name);
            _hand[turn]= new Hand();
        }
        
        int round =1;
        boolean stop=false;
        while(!stop){
            System.out.println("-----Round "+round+"-----");
            for(int turn = 0; turn<size; turn++){
                System.out.println(""+"'s turn");
                boolean deal = false;
                do {
                    System.out.println("Stand or Deal");
                    String choice = in.nextLine();
                    if(choice.equals("deal"))
                        deal();
                }while ((_player[turn].getSum()<21) && deal);
            }
            declareWinner();
            for(int index=0;index<size;index++){
                if(_score[index]==_endScore){
                    System.out.println(""+" Wins the game");
                    stop=true;
                }
            }
        }
    }
    
    @Override
    public void declareWinner() {
         int max = 0;
        ArrayList winner = new ArrayList();
        winner.add(0);
        for (int turn = 0; turn < size; turn++) {
            if ((max < _player[turn].getSum()) && (_player[turn].getSum()<=21) ) {
                max = (int) _player[turn].getSum();
                winner = new ArrayList();
                winner.add(turn);
            }
            else if(max == (int) _player[turn].getSum() && ((int) _player[turn].getSum() <= 21)) {
                winner.add(turn);
            }
        }    
        
        if ((int) winner.get(0) == _player.length - 1) {
            System.out.println("Dealer Wins");
            _score[_player.length - 1]++;
        } else
            for(int c=0; c<winner.size();c++) {
                System.out.println("Player " + ((int) winner.get(c) + 1) + " wins");
                _score[(int) winner.get(c)]++;
            }
    }
    
    
    
}