

public class CallingCard extends Card
{
    private String cardNumber;
    private String PIN;
    
    public CallingCard(String n, String cardNum, String PINin)
    {
        super(n);
        cardNumber = cardNum;
        PIN = PINin;
    }

    public String toString()
    {
        return "Class Calling Card \nName: " + super.getName() + "\nCard Number: " + cardNumber + "\nPIN: " + PIN;
    }

    public static void main(String args[])
    {
        CallingCard card1 = new CallingCard("Paul","12226","1234");
        System.out.println(card1.toString());
    }
    
    public boolean equals(Card cardIn){
        if( cardIn.toString().equals(this.toString())){
            return true;
        }
        else{
            return false;
        }
    }
}
