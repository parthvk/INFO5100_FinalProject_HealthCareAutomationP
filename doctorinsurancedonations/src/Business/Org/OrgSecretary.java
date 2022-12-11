/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Role.GovSecratary;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ankitajha
 */
public class OrgSecretary extends Organization {

    public OrgSecretary() {
        super(Organization.Type.Secretary.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovSecratary());
        return roles;
    }
    
}
