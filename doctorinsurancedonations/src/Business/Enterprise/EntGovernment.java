/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Org.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class EntGovernment extends Enterprise {

    //For enterprise government list is bein maintained 
    public EntGovernment(String name) {
        super(name, EnterpriseType.GovernmentEnt);
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    //List to get all organiation types in heathcare system
    @Override
    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> organizationTypes = new ArrayList<>();
        //Secretary healthcare and treasurer is added in organisation in enterpise
        organizationTypes.add(Organization.Type.Secretary);
        organizationTypes.add(Organization.Type.HealthcareOfficer);
        organizationTypes.add(Organization.Type.Treasurer);

        return organizationTypes;
    }

}
