public class BillfoldTester{ 
    public static void main(String args[]){
        Billfold bill = new Billfold();
        CallingCard cardA = new CallingCard("Paul","12226","1234");
        DriverLicense cardB = new DriverLicense("Paul","2013");
        DriverLicense cardC = new DriverLicense("Paul","2013");
        
        bill.addCard(cardC);
        bill.addCard(cardB);
        
        System.out.println(bill.formatCards());
        System.out.println(cardB.isExpired());
        
        System.out.println(bill.getExpiredCardCount());
        System.out.println(cardB.equals(cardC));
        System.out.println(cardB.equals(cardA));
    }
}