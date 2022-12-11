/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Role.RoleAccountant;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author ankitajha
 */
public class OrgAccountant extends Organization {

    public OrgAccountant() {
        super(Organization.Type.Accountant.getValue());

    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleAccountant());
        return roles;
    }

}
