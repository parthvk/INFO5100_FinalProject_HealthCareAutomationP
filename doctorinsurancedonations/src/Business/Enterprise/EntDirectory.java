/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author @pratik
 */
public class EntDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> entList) {
        this.enterpriseList = entList;
    }
    
    public EntDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType entType){
        
        Enterprise ent=null;
        
        if(entType==Enterprise.EnterpriseType.HealthServicesEnt){
            ent=new EntHealthServices(name);
            enterpriseList.add(ent);
        }
        
        else if(entType == Enterprise.EnterpriseType.GovernmentEnt)
        {
            ent =  new EntGovernment(name);
            enterpriseList.add(ent);
            
        }
        
        else if(entType == Enterprise.EnterpriseType.InsuranceEnt)
        {
            ent = new EntInsurance(name);
            enterpriseList.add(ent);
            
            
        }
        else if(entType == Enterprise.EnterpriseType.NGOEnt)
        {
            ent = new EntNGO(name);
            enterpriseList.add(ent);
            
        }
        return ent;
    }
}
