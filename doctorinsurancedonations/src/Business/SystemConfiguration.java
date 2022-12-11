package Business;

import Business.Employee.Staff;
import Business.Role.RoleSysAdmin;
import Business.SystemUserAccount.SystemUsers;


public class SystemConfiguration {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        
        Staff employee = ecosystem.getEmpDir().createEmployee("sysadmin");
        
        SystemUsers userAccount = ecosystem.getUsrAccDir().createUserAccount("sysadmin", "sysadmin", employee, new RoleSysAdmin());
        
        return ecosystem;
    }
    
}
