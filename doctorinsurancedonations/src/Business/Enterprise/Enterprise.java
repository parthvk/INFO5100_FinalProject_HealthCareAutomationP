 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Org.Organization;
import Business.Org.OrgDirectory;
import java.util.List;

/**
 *
 * @author Pratik
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private OrgDirectory orgDirectory;

    public OrgDirectory getOrgDir() {
        return orgDirectory;
    }
//Enums for overall enterprises in healthcare 
    public enum EnterpriseType {

        HealthServicesEnt("HealthCenter"),
        InsuranceEnt("InsuranceCompany"),
        GovernmentEnt("Government"),
        NGOEnt("NGO");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEntType() {
        return enterpriseType;
    }

    public void setEntType(EnterpriseType entType) {
        this.enterpriseType = entType;
    }

    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.enterpriseType = type;
        orgDirectory = new OrgDirectory();
    }
    
    public abstract List<Organization.Type> getAllOrgTypes();
}
