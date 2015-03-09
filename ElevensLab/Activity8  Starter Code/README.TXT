1. Discuss the similarities and differences between Elevens, Thirteens, and Tens.

They have similar set-ups (aka states) and rules/processes (aka methods), but they differ in which cards constitute a set that can be removed

2. As discussed previously, all of the instance variables are declared in the Board class. But it is the
ElevensBoard class that ?knows? the board size, and the ranks, suits, and point values of the
cards in the deck. How do the Board instance variables get initialized with the ElevensBoard
values? What is the exact mechanism?

Through the super() method.

3. Now examine the files Board.java, and ElevensBoard.java, found in the Activity8
Starter Code directory. Identify the abstract methods in Board.java. See how these
methods are implemented in ElevensBoard. Do they cover all the differences between Elevens,
Thirteens, and Tens as discussed in question 1? Why or why not?

Yes, it does not specify which cards constitute a legal play so it is not overly specific, but it 
does contain all the necessary methods to judge if the player has lost, won, or can continue.