/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.OrgInsurancePolicyPlanner;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.InsurancePolicyPlannerRole.InsurancePolicyPlannerWorkAreaJPanel;

/**
 *
 * @author Pratik
 * * This class is used for Insurance Policy Planner role
 */
public class RoleInsPolicyPlanner extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new InsurancePolicyPlannerWorkAreaJPanel(userProcessContainer, account, (OrgInsurancePolicyPlanner)organization, enterprise);
    }
    
}
