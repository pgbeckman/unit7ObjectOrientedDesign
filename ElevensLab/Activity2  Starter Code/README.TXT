1. Explain in your own words the relationship between a deck and a card.

Composition - a deck is composed of ('has-a') cards

2. Consider the deck initialized with the statements below. How many cards does the deck contain?
 String[] ranks = {"jack", "queen", "king"};
 String[] suits = {"blue", "red"};
 int[] pointValues = {11, 12, 13};
 Deck d = new Deck(ranks, suits, pointValues);
 
 6 cards
 
3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2
(lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point
value 10; an ace has point value 11; point values for 2, ?, 10 are 2, ?, 10, respectively. Specify the
contents of the ranks, suits, and pointValues arrays so that the statement
 Deck d = new Deck(ranks, suits, pointValues);
initializes a deck for a Twenty-One game.

String[] ranks = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
 String[] suits = {"Diamonds", "Clubs","Spades","Hearts"};
 int[] pointValues = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};

4. Does the order of elements of the ranks, suits, and pointValues arrays matter?

Yes, it must be the same for ranks and pointValues, since the value of a given card must be the same for both of these.
For suits, however, the order does not matter.