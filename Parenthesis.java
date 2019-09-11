//********************************************************************************************************
// CLASS: Parenthesis (Parenthesis.java)
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
 * Parenthesis is the superclass of LeftParen and RightParen. These are treated
 * as a weird sort of Operator because we need to be able to push LeftParens on
 * the operator stack when evaluating the expression.
 */
public abstract class Parenthesis extends Operator {

    public Parenthesis() {
    }

    /**
     * Parenthesiss are not really operators so return false.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}
