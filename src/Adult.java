/*
 * Adult.java
 */
// create Adult class that extends from Customer

public class Adult extends Customer {

    public Adult(String customerName, String customerAddress, int customerAge, String customerPhoneNumber) {
        super(customerName, customerAddress, customerAge, customerPhoneNumber);
    }

    @Override
    public String getType() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getType'");
    }

    @Override
    public double getSavingInterest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSavingInterest'");
    }

    @Override
    public double getCheckInterest() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCheckInterest'");
    }

    @Override
    public double getCheckCharge() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCheckCharge'");
    }

    @Override
    public double getOverdraftPenalty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOverdraftPenalty'");
    }

    /** Creates a new instance of Adult */

    /** getter for getType return "Adult" */

    /** getter for Savings Interest */

    /** getter for Check Interest */

    /** getter for Check Charge */

    /** getter for OverdraftPenalty */


}