/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.OrgInsuranceAgent;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.InsuranceAgentRole.InsuranceAgentWorkAreaJPanel;

/**
 *
 * @author Pratik* This class is used for Insurance Agent role
 */
public class RoleInsuranceAgent extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem business) {
     return new InsuranceAgentWorkAreaJPanel(userProcessContainer, account, (OrgInsuranceAgent)organization, enterprise);
    }
    
}
