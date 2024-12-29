
/*
 * Student.java
 */
// create Student class that extends from Customer

/** Creates a new instance of Student */

/** getter for getType return "Student" */

/** getter for Savings Interest */

/** getter for Check Interest */

/** getter for Check Charge */

/** getter for OverdraftPenalty */
public class Student extends Customer {

    public Student(String customerName, String customerAddress, int customerAge, String customerPhoneNumber) {
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

}
