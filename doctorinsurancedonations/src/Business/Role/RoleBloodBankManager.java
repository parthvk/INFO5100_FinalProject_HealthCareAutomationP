/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.BloodBankManagerRole.BloodBankManagerWorkAreaJPanel;

/**
 *
 * @author Pratik
 * This class is used for BOold Bank Manager role
 */
public class RoleBloodBankManager extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization,
            Enterprise enterprise, EcoSystem business) {
        return new BloodBankManagerWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
}
