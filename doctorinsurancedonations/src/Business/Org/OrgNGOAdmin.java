/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Role.RoleNGOAdmin;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ankitajha
 */
public class OrgNGOAdmin extends Organization{

    public OrgNGOAdmin() {
        super(Organization.Type.NGOAdministrator.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleNGOAdmin());
        return roles;
    }
     
}