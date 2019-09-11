//********************************************************************************************************
// CLASS: NegOperator (NegOperator.java)
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
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator {

    public NegOperator() {
    }

    /**
     * Returns the negation of the operand.
     */
    @Override
    public Operand evaluate(Operand pOperand) {
        return new Operand(-pOperand.getValue());
    }

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
    public int precedence() {
        return 4;
    }

    /**
     * Returns the precedence level of this operator when on it is on the
     * operator stack.
     */
    @Override
    public int stackPrecedence() {
        return 4;
    }

}
