
package Business.WorkQueue;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Parth
 */
public class InsReq extends WorkReq {

    private String policyNumber; //Policy Number
    private String socialsecurityNumber; //Social Security Number
    private String nameOfPolicy; //Name of the policy
    private String insuranceName; //Insurance Name
    private double clmAmt; //Claim Amount
    private String InsPlcyAgnt; //Insurance Policy Agent
    private String financerName; //Financer Name
    private double billingAmt; //Billing Amount
    private InsuranceCustomer insuranceCust; //Insurance Customer
    private String hlthCentre; //Health Center Name

    //Getter and Setters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String plcyNo) {
        this.policyNumber = plcyNo;
    }

    public String getSocialsecurityNumber() {
        return socialsecurityNumber;
    }

    public void setSocialsecurityNumber(String ssn) {
        this.socialsecurityNumber = ssn;
    }

    public String getNameOfPolicy() {
        return nameOfPolicy;
    }

    public void setNameOfPolicy(String policyType) {
        this.nameOfPolicy = policyType;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insCmpny) {
        this.insuranceName = insCmpny;
    }

    public double getClmAmt() {
        return clmAmt;
    }

    public void setClmAmt(double claimAmt) {
        this.clmAmt = claimAmt;
    }

    @Override
    public String toString() {
        return policyNumber;
    }

    public String getInsPlcyAgnt() {
        return InsPlcyAgnt;
    }

    public void setInsPlcyAgnt(String agent) {
        this.InsPlcyAgnt = agent;
    }

    public String getFinancerName() {
        return financerName;
    }

    public void setFinancerName(String financer) {
        this.financerName = financer;
    }

    public double getBillingAmt() {
        return billingAmt;
    }

    public void setBillingAmt(double billAmt) {
        this.billingAmt = billAmt;
    }

    public InsuranceCustomer getInsuranceCust() {
        return insuranceCust;
    }

    public void setInsuranceCust(InsuranceCustomer insCust) {
        this.insuranceCust = insCust;
    }

    public String getHlthCentre() {
        return hlthCentre;
    }

    public void setHlthCentre(String healthCtr) {
        this.hlthCentre = healthCtr;
    }

}
