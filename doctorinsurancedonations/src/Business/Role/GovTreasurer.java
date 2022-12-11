/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.Organization;
import Business.Org.OrgTreasurer;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;
import userinterface.GovernmentTreasurerRole.TreasurerWorkAreaJPanel;

/**
 *
 * @author Pratik
 * This class is used for Government Treasurer role
 */
public class GovTreasurer extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new TreasurerWorkAreaJPanel(userProcessContainer, userAccount, (OrgTreasurer)organization, enterprise);
    }
    
}
