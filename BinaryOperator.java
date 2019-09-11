//********************************************************************************************************
// CLASS: BinaryOperator (BinaryOperator.java)
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, FallB 2018
// Project Number: p4
//
// AUTHOR
// Heather Fryling hfryling@asu.edu (Not really. Kevin Burger is the author, but the instructions said to put this on all classes.)
//********************************************************************************************************
//**************************************************************************************************************
// CLASS: BinaryOperator
//
// AUTHOR
// Kevin R. Burger (burgerk@asu.edu)
// Computer Science & Engineering Program
// Fulton Schools of Engineering
// Arizona State University, Tempe, AZ 85287-8809
// http://www.devlang.com
//**************************************************************************************************************
/**
 * BinaryOperator is the superclass of all binary operators.
 */
package p04;

public abstract class BinaryOperator extends Operator {

    public BinaryOperator() {
    }

    /**
     * Called to evaluate the operator.
     */
    public abstract Operand evaluate(Operand pLhsOperand, Operand pRhsOperand);

    /**
     * Returns true since all subclasses of BinaryOperator are binary operators.
     */
    @Override
    public boolean isBinaryOperator() {
        return true;
    }

}
