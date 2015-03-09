1. The size of the board is one of the differences between Elevens and Thirteens. Why is size not an
abstract method?

Size is not a verb, it is a noun. Therefore it is a variable within the board and not a method.

2. Why are there no abstract methods dealing with the selection of the cards to be removed or replaced
in the array cards?

The specific rules vary depending on the variation of the game.

3. Another way to create ?IS-A? relationships is by implementing interfaces. Suppose that instead of
creating an abstract Board class, we created the following Board interface, and had
ElevensBoard implement it. Would this new scheme allow the Elevens GUI to call isLegal
and anotherPlayIsPossible polymorphically? Would this alternate design work as well as
the abstract Board class design? Why or why not?
 public interface Board
 {
 boolean isLegal(List<Integer> selectedCards);
 boolean anotherPlayIsPossible();
 }
 
 Yes, it would still provide a generalized plan to implement with each individual game.
 Yes, it would work just about as well.