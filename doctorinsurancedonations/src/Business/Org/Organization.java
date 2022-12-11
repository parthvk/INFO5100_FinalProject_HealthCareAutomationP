/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Org;

import Business.Employee.StaffDirectory;
import Business.Role.Role;
import Business.SystemUserAccount.UsersDirectory;
import Business.WorkQueue.WorkQ;
import java.util.ArrayList;


public abstract class Organization {

    private String orgNm; //organisation name
    private WorkQ wrkQ;
    private StaffDirectory empDir; //employee directory
    private UsersDirectory usrAccDir; //added user account directory
    private int orgID; //organisation id
    private static int cntr = 0; //counter
    
// Enums for ogranisation types
    public enum Type {

        //HealthCenter Organization Types:
        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Patient("Patient Organization"), Accountant("Accountant Organization"),BloodBank("BloodBank Manager Organization"),
        //Insurance Organization Types:
        InsuranceAgent("Insurance Agent Organization"), InsurancePolicyPlanner("Insurance Policy Planning Organization"), InsuranceFinanceOrganization("Insurance Finance Organization"),
        //Government Organization Types
        Treasurer("Treasurer Organization"), Secretary("Secretary Organization"), HealthcareOfficer("Healthcare Officer Organization"),
        //NGO Organization Types
        NGOAdministrator("Administrator Organization"), Director("Director Organization");
        

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.orgNm = name;
        wrkQ = new WorkQ();
        empDir = new StaffDirectory();
        usrAccDir = new UsersDirectory();
        orgID = cntr;
        ++cntr;
    }

    public abstract ArrayList<Role> getSupportRole();

    public UsersDirectory getUsrAccDir() {
        return usrAccDir;
    }

    public int getOrgID() {
        return orgID;
    }

    public StaffDirectory getEmpDir() {
        return empDir;
    }

    public String getName() {
        return orgNm;
    }

    public WorkQ getWrkQ() {
        return wrkQ;
    }

    public void setName(String name) {
        this.orgNm = name;
    }

    public void setWrkQ(WorkQ wrkQ) {
        this.wrkQ = wrkQ;
    }

    @Override
    public String toString() {
        return orgNm;
    }

}
