/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class EntNGO extends Enterprise{

    public EntNGO(String name) {
        super(name, Enterprise.EnterpriseType.NGOEnt);
    }
    
     @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    @Override
    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> orgnanizationTypes = new ArrayList<>();
        orgnanizationTypes.add(Organization.Type.NGOAdministrator);
        orgnanizationTypes.add(Organization.Type.Director);

        return orgnanizationTypes;
    }
    
}
