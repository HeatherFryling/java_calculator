//********************************************************************************************************
// CLASS: UnaryOperator (UnaryOperator.java)
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
 * UnaryOperator is the superclass of all unary operators.
 */
public abstract class UnaryOperator extends Operator {

    public UnaryOperator() {
    }

    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pOperand);

    /**
     * Returns false since all subclasses of UnaryOperator are unary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return false;
    }

}
