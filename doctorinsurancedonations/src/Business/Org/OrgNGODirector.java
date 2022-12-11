/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Org;

import Business.Role.RoleNGODirector;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author ankitajha
 */
public class OrgNGODirector extends Organization{
    public OrgNGODirector() {
        super(Organization.Type.Director.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RoleNGODirector());
        return roles;
    }
}
