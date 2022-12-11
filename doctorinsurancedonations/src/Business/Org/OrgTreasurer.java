/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Role.GovTreasurer;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ankitajha
 */
public class OrgTreasurer extends Organization {

   public OrgTreasurer() {
        super(Organization.Type.Treasurer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovTreasurer());
        return roles;
    }
    
}
