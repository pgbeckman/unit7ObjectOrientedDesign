

public class IDCard extends Card
{
    private String idNumber;
    
    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }

    public String toString()
    {
        return "Class IDCard \nName: " + super.getName() + "\nID Number: " + idNumber;
    }

    public static void main(String args[])
    {
        IDCard card1 = new IDCard("Paul","12226");
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
