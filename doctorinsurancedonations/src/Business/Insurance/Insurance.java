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
public class Insurance {

    private String policyName;
    private String insuranceCompany;
    private double coverage;
    private String policyTnC;
    private double monthlyPremium;

    //Insurance constructor added
    public Insurance(String policyName, String insuranceCompany, double coverage) {
        this.policyName = policyName;
        this.insuranceCompany = insuranceCompany;
        this.coverage = coverage;
    }

    //added getter and setter 
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyType) {
        this.policyName = policyType;
    }

    public double getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(double monthlyPrm) {
        this.monthlyPremium = monthlyPrm;
    }

    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    public void setInsuranceCompany(String InsCmpny) {
        this.insuranceCompany = InsCmpny;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double cvrg) {
        this.coverage = cvrg;
    }

    public String getPolicyTnC() {
        return policyTnC;
    }

    public void setPolicyTnC(String plcyTC) {
        this.policyTnC = plcyTC;
    }

    @Override
    public String toString() {
        return policyName;
    }

}
