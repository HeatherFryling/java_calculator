//********************************************************************************************************
// CLASS: Operand (Operand.java)
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
 * An operand is a numeric value represented as a Double.
 */
public class Operand extends Token {

    private double mValue;

    /**
     * Constructor
     */
    public Operand(double pValue) {
        mValue = pValue;
    }

    /**
     * Returns the value stored in the Operand as a double.
     */
    public double getValue() {
        return mValue;
    }

    /**
     * Sets the value stored in the Operand.
     */
    public void setValue(double pValue) {
        mValue = pValue;
    }

}
