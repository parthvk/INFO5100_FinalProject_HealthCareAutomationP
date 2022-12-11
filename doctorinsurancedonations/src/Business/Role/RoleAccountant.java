/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.OrgAccountant;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.HealthcareAccountantRole.AccountantWorkAreaJPanel;

/**
 *
 * @author PratikThis class is used for Accountant role
 */
public class RoleAccountant extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem ecosystem) {
        return new AccountantWorkAreaJPanel(userProcessContainer, account, (OrgAccountant)organization, enterprise, ecosystem);
    }
    
}
