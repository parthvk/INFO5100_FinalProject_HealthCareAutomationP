/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.OrgDoctor;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author PratikThis class is used for Doctor role
 */
public class RoleDoctor extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, SystemUsers userAccount, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer, userAccount, (OrgDoctor)organization, enterprise);
    }
    
    
}
