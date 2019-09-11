//********************************************************************************************************
// CLASS: LeftParen (LeftParen.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, FallB 2018
// Project Number: p4
//
// AUTHOR
// Heather Fryling hfryling@asu.edu (Not really. Kevin Burger is the author, but the instructions said to put this on all classes.)
//********************************************************************************************************
package p04;

/**
 * Represents a left parenthesis in the expression.
 */
public class LeftParen extends Parenthesis {

    public LeftParen() {
    }

    /**
     * Returns the normal precedence level of LeftParen which is highest at 5.
     */
    @Override
    public int precedence() {
        return 5;
    }

    /**
     * Returns the precedence level of LeftParen when on it is on the operator
     * stack, it is lowest at 0.
     */
    @Override
    public int stackPrecedence() {
        return 0;
    }

}
