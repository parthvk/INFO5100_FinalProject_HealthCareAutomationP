
package Business.InsuranceCustomer;

/**
 *
 * @author Parth
 */

import java.util.ArrayList;
import java.util.List;


public class InsuranceCustomerDirectory {

    private List<InsuranceCustomer> insCust = new ArrayList<>();//List of customers with insurance

    //Getters Setters
    public List<InsuranceCustomer> getInsCust() {
        return insCust;
    }

    public void setInsCust(List<InsuranceCustomer> insCust) {
        this.insCust = insCust;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insCust + '}';
    }

}
