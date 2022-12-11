/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.OrgHealthCareOfficial;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.HealthcareOfficerRole.OfficerWorkAreaJPanel;

/**
 *
 * @author Pratik
 * This class is used for Government Health Official role
 */
public class RoleGovHealthOfficial extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new OfficerWorkAreaJPanel(userProcessContainer, userAccount, (OrgHealthCareOfficial)organization, enterprise);
    }
    
}
