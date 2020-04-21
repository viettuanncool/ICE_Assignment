/**
 *
 * @author jbias
 */
public class BJPlayer extends Player{
    private int sum;
    private int numOfAces;
    public BJPlayer(String name){
        super(name);
	Hand ch = new Hand(2);
    }
    public int getSum(){
        return sum;
    }
    public void getCard(){
        int value=Hand.getCard();
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
}