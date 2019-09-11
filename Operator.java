//********************************************************************************************************
// CLASS: Operator (Operator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, FallB 2018
// Project Number: p4
//
// AUTHOR
// Heather Fryling hfryling@asu.edu
//********************************************************************************************************
package p04;

/**
 * Operator is the superclass of all binary and unary operators.
 */
public abstract class Operator extends Token {

    /**
     * Constructor
     */
    public Operator() {
    }

    /**
     * Abstract method that returns true/false if an operator is binary.
     */
    public abstract boolean isBinaryOperator();

    /**
     * Abstract method that returns normal precedence of an Operator.
     */
    public abstract int precedence();

    /**
     * Abstract method that returns the stack precedence of an Operator.
     */
    public abstract int stackPrecedence();

}
