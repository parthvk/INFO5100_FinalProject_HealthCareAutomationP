/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//This class is used to define all the Roles present in the system
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Org.Organization;
import Business.SystemUserAccount.SystemUsers;
import javax.swing.JPanel;

public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"),
        LabAssistant("Lab Assistant"),
        Patient("Patient"),
        Accountant("Accountant"),
        InsuranceAgent("Insurance Agent"),
        InsurancePlanner("Insurance Policy Planner"),
        InsuranceFinanceManager("Insurance Finance Manager"),
        GovernmentHealthOfficer("Government Health Officer"),
        GovernmentTreasurer("Government Treasure"),
        GovernmentSecretaries("Government Secretaries"),
        BloodBankManager("Blood Bank Manager"),
        NGOAdministrator("NGO Administrator"),
        NGODirector("NGO Director");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            SystemUsers account,
            Organization organization,
            Enterprise enterprise,
            EcoSystem ecosystem);

    @Override
    public String toString() {

        return this.getClass().getName();
    }

}
