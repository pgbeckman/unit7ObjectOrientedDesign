import java.util.*;

public class DriverLicense extends Card
{
    private String expirationYear;
    
    public DriverLicense(String n, String expirationYearIn)
    {
        super(n);
        expirationYear = expirationYearIn;
    }

    public String toString()
    {
        return "Class Driver License \nName: " + super.getName() + "\nExpiration Year: " + expirationYear;
    }
    
    public boolean isExpired()
    {
        GregorianCalendar calendar = new GregorianCalendar();
        
        if(Integer.parseInt(expirationYear) < calendar.get(Calendar.YEAR)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String args[])
    {
        DriverLicense card1 = new DriverLicense("Paul","2016");
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
