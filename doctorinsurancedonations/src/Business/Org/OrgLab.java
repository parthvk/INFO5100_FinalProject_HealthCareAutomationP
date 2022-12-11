/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Role.RoleLabAssistant;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author ankitajha
 */
public class OrgLab extends Organization{

    public OrgLab() {
        super(Organization.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleLabAssistant());
        return roles;
    }
     
   
    
    
}
