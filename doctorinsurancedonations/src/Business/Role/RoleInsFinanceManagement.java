/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.OrgInsuranceFinance;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.InsuranceFinanceRole.InsuranceFinanceWorkAreaJPanel;

/**
 *
 * @author Pratik
 * * This class is used for Insurance Finance Management role
 */
public class RoleInsFinanceManagement extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsuranceFinanceWorkAreaJPanel(userProcessContainer, account, (OrgInsuranceFinance)organization, enterprise);
    }
    
}
