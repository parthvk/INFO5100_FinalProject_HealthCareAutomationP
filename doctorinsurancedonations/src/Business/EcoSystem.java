/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Networks.Networks;
import Business.Org.Organization;
import Business.Role.Role;
import Business.Role.RoleSysAdmin;
import java.util.ArrayList;


public class EcoSystem extends Organization{
    
    private static EcoSystem ecosystem;
    private ArrayList<Networks> networks;
    public static EcoSystem getInstance(){
        if(ecosystem==null){
            ecosystem=new EcoSystem();
        }
        return ecosystem;
    }
    
    public Networks createAndAddNetwork(){
        Networks network=new Networks();
        networks.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new RoleSysAdmin());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networks=new ArrayList<Networks>();
    }

    public ArrayList<Networks> getNetworks() {
        return networks;
    }

    public void setNetworks(ArrayList<Networks> networks) {
        this.networks = networks;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUsrAccDir().isUniqueUser(userName)){
            return false;
        }
        for(Networks network:networks){
            
        }
        return true;
    }
}
