/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Role.RoleEntAdmin;
import Business.Role.Role;
import java.util.ArrayList;


public class OrgAdmin extends Organization{

    public OrgAdmin() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleEntAdmin());
        return roles;
    }
     
}
