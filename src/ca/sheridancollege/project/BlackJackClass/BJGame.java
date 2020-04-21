package ca.sheridancollege.project.BlackJackClass;

import java.util.ArrayList;
import java.util.Scanner;


public class BJGame extends Game {
    private BJPlayer [] _player;
    private int size;
    private int [] _score;
    private int _endScore;
    private final int deckSize = 52;

    
    public BJGame(){
        super("Black Jack");
    }
    
    @Override
    public void play() {
        Scanner in = new Scanner(System.in);
            try{
                System.out.println("Please enter the amount of players(Atleast 2)");
                size = in.nextInt();
                System.out.println("Enter the score you want to finish on");
                _endScore = in.nextInt();
                _player = new BJPlayer[size];
                _score = new int [size];
            }catch(Exception e){
                System.out.println("Wrong type of input! Game terminated");
                System.exit(0);
            }
 
        for(int turn = 0; turn<size; turn++){
            System.out.println("Player "+turn+", enter your name. ");
            String name = in.next();
            _player[turn]= new BJPlayer(name);
        }
        
        int round =1;
        boolean stop=false;
        while(!stop){
            
            System.out.println("-----Round "+round+"-----");
            for(int turn = 0; turn<size; turn++){
                String name = _player[turn].getPlayerID();
                System.out.println("%%%%%"+name+"'s turn%%%%%");
                _player[turn].play();
            }
            System.out.println("Round Ended");
            declareWinner();
            
            
            for(int index=0;index<size;index++){
                if(_score[index]==_endScore){
                    System.out.println("Game Ended");
                    stop=true;
                }
            }
            round++;
        }
    }
    
    @Override
    public void declareWinner() {
        int max = 0;
        ArrayList winner = new ArrayList();
        for (int turn = 0; turn < size; turn++) {
            if ((max < _player[turn].getSum()) && (!_player[turn].bust())) {
                max = (int) _player[turn].getSum();
                winner = new ArrayList();
                winner.add(turn);
            }
            else if(max == (int) _player[turn].getSum() && (!_player[turn].bust())) {
                winner.add(turn);
            }
        }
        
        if(winner.size()==0 || winner.size()==size){
            System.out.println("Draw Game");
        }
        else{
            for(int c=0; c<winner.size();c++) {
                System.out.println(_player[(int) winner.get(c)].getPlayerID()+ " wins");
                _score[(int) winner.get(c)]++;
            }
        }
    }
}
   
    
    
