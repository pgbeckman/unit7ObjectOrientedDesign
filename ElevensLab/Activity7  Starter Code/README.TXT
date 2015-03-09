Activity 6 Questions:

1. List all possible plays for the board 5? 4? 2? 6? A? J? K? 5? 2?

5?,6?
5?,6?

2. If the deck is empty and the board has three cards left, must they be J, Q, and K? Why or why not?

Yes, if they were not J, Q, and K, they would have to be pairs of numbers, which would leave two cards remaining. 

3. Does the game involve any strategy? That is, when more than one play is possible, does it matter
which one is chosen? Briefly explain your answer. 

No, since cards are replaced from the deck at random, any move is as likely to yield possible future moves as any other.

--- --- ---

Activity 7 Questions:

1. What items would be necessary if you were playing a game of Elevens at your desk (not on the
computer)? List the private instance variables needed for the ElevensBoard class.

The board, a deck

private Card[] cards 
private Deck deck

2. Write an algorithm that describes the actions necessary to play the Elevens game.

Deal 9 cards
Loop until deck and cards played are empty:
~Allow player to select 2 cards
~Check if they are correct; if so, replace them from the deck

3. Now examine the partially implemented ElevensBoard.java file found in the Activity7
Starter Code directory. Does the ElevensBoard class contain all the state and behavior
necessary to play the game?

yes.

4. ElevensBoard.java contains three helper methods. These helper methods are private
because they are only called from the ElevensBoard class.
a. Where is the dealMyCards method called in ElevensBoard?

In the constructor and in newGame()

b. Which public methods should call the containsPairSum11 and containsJQK
methods?

anotherPlayIsPossible()

c. It?s important to understand how the cardIndexes method works, and how the list that it
returns is used. Suppose that cards contains the elements shown below. Trace the execution
of the cardIndexes method to determine what list will be returned. Complete the diagram
below by filling in the elements of the returned list, and by showing how those values index
cards. Note that the returned list may have less than 9 elements.
 cards ->
J? 6? null 2? null null A? 4? null
returned list -> 
0 1 3 6 7

d. Complete the following printCards method to print all of the elements of cards that are
indexed by cIndexes.
public static printCards(ElevensBoard board) {
   List<Integer> cIndexes = board.cardIndexes();
    for(int i = 0; i < cardIndexes.size(); i++){
        System.out.println(cards[cardIndexes.get(k)].toString);
      }
}

e. Which one of the methods that you identified in question 4b above needs to call the
cardIndexes method before calling the containsPairSum11 and containsJQK
methods? Why?

All of them. You couldn't call either of the contains methods without knowing if there are null spaces
on the board. Otherwise you might be checking null spaces on the board, which would generate an error.