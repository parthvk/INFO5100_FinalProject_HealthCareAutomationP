/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

/**
 *
 * @author ankitajha
 */

import java.util.ArrayList;
import java.util.List;

// This class maintains List of insurances as a directory 
public class InsurancePolicyDirectory {

    private List<Insurance> insurancePolicies = new ArrayList<>();

    //getter and setters 
    public List<Insurance> getInsurancePolicies() {
        return insurancePolicies;
    }

    public void setInsurancePolicies(List<Insurance> insurancePolicies) {
        this.insurancePolicies = insurancePolicies;
    }
    
}
