
public class Billfold
{
    private Card card1;
    private Card card2;

    public Billfold()
    {
    }

    public void addCard(Card cardIn)
    {
        if(card1 == null){
            card1 = cardIn;
        }
        else if(card2 == null){
            card2 = cardIn;
        }
    }

    public String formatCards()
    {
        String out = "";
        if(card1 != null){
            out += card1.format();
        }
        if(card2 != null){
            out += "\n" + card2.format();
        }
        return out;
    }
    
    public int getExpiredCardCount(){
        int count = 0;
        if(card1 != null && card1.isExpired()){
            count++;
        }
        if(card2 != null && card2.isExpired()){
            count++;
        }
        return count;
    }
}
