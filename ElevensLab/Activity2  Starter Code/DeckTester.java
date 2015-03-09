/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks1 = {"A","B","C"};
		String[] suits1 = {"Cats","Dogs"};
		int[] values1 = {1,2,3};
	    Deck deck1 = new Deck(ranks1,suits1,values1);
	    
	    String[] ranks2 = {"Ten","Four","Five"};
		String[] suits2 = {"Elephants"};
		int[] values2 = {10,4,5};
		Deck deck2 = new Deck(ranks2,suits2,values2);
		
		String[] ranks3 = new String[5];
		String[] suits3 = new String[5];
		int[] values3 = new int[5];
		Deck deck3 = new Deck(ranks3,suits3,values3);
		
		System.out.println(deck1.isEmpty());
		System.out.println(deck3.isEmpty());
		System.out.println(deck2.size());
		deck2.deal();
		System.out.println(deck2.size());
		System.out.println(deck2.toString());
	}
}
