/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SystemUserAccount;

import Business.Role.Role;
import Business.Employee.Staff;

import java.util.ArrayList;


public class UsersDirectory {

    //systemUser account details 
    //the user directory added for all system 
    //This will store different users for healthcare system
    private ArrayList<SystemUsers> sysUserAccountList;

    public UsersDirectory() {
        sysUserAccountList = new ArrayList();
    }

    public ArrayList<SystemUsers> getUsrAccList() {
        return sysUserAccountList;
    }

    public SystemUsers createUserAccount(String username, String password, Staff employee, Role role) {
        SystemUsers userAccount = new SystemUsers();
        userAccount.setUsrName(username);
        userAccount.setPsswrd(password);
        userAccount.setEmploye(employee);
        userAccount.setEmpRole(role);
        sysUserAccountList.add(userAccount);
        return userAccount;
    }

    public SystemUsers createUserAccount(String username, String password, Staff employee, Role role, String type) {
        SystemUsers userAccount = new SystemUsers();
        userAccount.setUsrName(username);
        userAccount.setPsswrd(password);
        userAccount.setEmploye(employee);
        userAccount.setEmpRole(role);
        userAccount.setUserType(type);
        sysUserAccountList.add(userAccount);
        return userAccount;
    }

    public boolean isUniqueUser(String username) {
        for (SystemUsers usrAcc : sysUserAccountList) {
            if (usrAcc.getUsrName().equals(username)) {
                return false;
            }
        }
        return true;
    }
    
    public SystemUsers validateUser(String username, String password) {
        for (SystemUsers usrAcc : sysUserAccountList) {
            if (usrAcc.getUsrName().equals(username) && usrAcc.getPsswrd().equals(password)) {
                return usrAcc;
            }
        }
        return null;
    }    
}
