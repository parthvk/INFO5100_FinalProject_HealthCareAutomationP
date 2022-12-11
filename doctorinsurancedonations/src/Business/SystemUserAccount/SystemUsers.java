/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemUserAccount;

import Business.WorkQueue.WorkQ;
import Business.Employee.Staff;
import Business.Role.Role;

public class SystemUsers {

    private String usrName;
    private String psswrd;
    private Staff employe;
    private Role empRole;
    private WorkQ workQ;
    private String userType;

    public String getUserType() {
        return userType;
    }

    public void setUserType(String type) {
        this.userType = type;
    }

    public SystemUsers() {
        workQ = new WorkQ();
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String uname) {
        this.usrName = uname;
    }

    public String getPsswrd() {
        return psswrd;
    }

    public void setPsswrd(String pwd) {
        this.psswrd = pwd;
    }

    public Role getEmpRole() {
        return empRole;
    }

    public void setEmploye(Staff emp) {
        this.employe = emp;
    }

    public void setEmpRole(Role role) {
        this.empRole = role;
    }

    public Staff getEmploye() {
        return employe;
    }

    public WorkQ getWorkQ() {
        return workQ;
    }

    @Override
    public String toString() {
        return usrName;
    }

}