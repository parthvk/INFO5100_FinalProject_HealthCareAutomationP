/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Org.Organization.Type;
import static Business.Org.Organization.Type.InsuranceFinanceOrganization;
import java.util.ArrayList;

public class OrgDirectory {

    private ArrayList<Organization> orgList;

    public OrgDirectory() {
        orgList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizations() {
        return orgList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        // Adding HealthCenter Organizations
        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new OrgDoctor();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new OrgLab();
            orgList.add(organization);
        }

        else if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new OrgPatient();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Accountant.getValue())) {
            organization = new OrgAccountant();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.BloodBank.getValue())) {
            organization = new OrgBloodBankManager();
            orgList.add(organization);

        }

        // Adding Government Organizations

        else if (type.getValue().equals(Type.HealthcareOfficer.getValue())) {
            organization = new OrgHealthCareOfficial();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Secretary.getValue())) {
            organization = new OrgSecretary();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.Treasurer.getValue())) {
            organization = new OrgTreasurer();
            orgList.add(organization);

        }
        // Adding Insurance Organizations

        else if (type.getValue().equals(Type.InsuranceAgent.getValue())) {
            organization = new OrgInsuranceAgent();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsuranceFinanceOrganization.getValue())) {
            organization = new OrgInsuranceFinance();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsurancePolicyPlanner.getValue())) {
            organization = new OrgInsurancePolicyPlanner();
            orgList.add(organization);

        }
        // Adding NGO Organizations

        else if (type.getValue().equals(Type.NGOAdministrator.getValue())) {
            organization = new OrgNGOAdmin();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Director.getValue())) {
            organization = new OrgNGODirector();
            orgList.add(organization);

        }
        return organization;
    }
}