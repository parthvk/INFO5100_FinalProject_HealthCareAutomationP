/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Insurance.InsurancePolicyDirectory;
import Business.InsuranceCustomer.InsuranceCustomerDirectory;
import Business.Org.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class EntInsurance extends Enterprise {

    private InsuranceCustomerDirectory insuranceCustomerDirectory;

    private InsurancePolicyDirectory insurancePolicyDirectory;

    public EntInsurance(String name) {
        super(name, EnterpriseType.InsuranceEnt);
        insuranceCustomerDirectory = new InsuranceCustomerDirectory();
        insurancePolicyDirectory = new InsurancePolicyDirectory();

    }

    @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> orgnanizationTypes = new ArrayList<>();
        orgnanizationTypes.add(Organization.Type.InsuranceAgent);
        orgnanizationTypes.add(Organization.Type.InsurancePolicyPlanner);
        orgnanizationTypes.add(Organization.Type.InsuranceFinanceOrganization);

        return orgnanizationTypes;
    }

    public InsuranceCustomerDirectory getInsuranceCustomerDirectory() {
        return insuranceCustomerDirectory;
    }

    public void setInsCustDir(InsuranceCustomerDirectory insuranceCustomerDirectory) {
        this.insuranceCustomerDirectory = insuranceCustomerDirectory;
    }

    public InsurancePolicyDirectory getInsPlcyDir() {
        return insurancePolicyDirectory;
    }

    public void setInsPlcyDir(InsurancePolicyDirectory insurancePolicyDirectory) {
        this.insurancePolicyDirectory = insurancePolicyDirectory;
    }

}
