public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
   
   public String toString()
   {
        return "Class Card \nName: " + name;
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