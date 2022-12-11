/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Org;

import Business.Role.RoleBloodBankManager;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ankitajha
 */
public class OrgBloodBankManager extends Organization{
    
    public OrgBloodBankManager() {
        super(Organization.Type.BloodBank.getValue());
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleBloodBankManager());
        return roles;
    }
     
   
    
    
}

