/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkQueue;

/**
 *
 * @author Parth
 */
public class NGOFundRequest extends WorkReq{
    
    private String nameOfHospital; //Name of Hospital
    private String addressOfHospital; //Address of Hospital
    private int amountRequired; //Amount Required
    
    public NGOFundRequest(String nameOfHospital, String addressOfHospital, int amountRequired){
        this.nameOfHospital = nameOfHospital;
        this.addressOfHospital = addressOfHospital;
        this.amountRequired = amountRequired;
    }
    
    //Getters and Setters
    @Override
    public String toString() {
        return nameOfHospital;
    }

    public String getNameOfHospital() {
        return nameOfHospital;
    }

    public void setNameOfHospital(String hospname) {
        this.nameOfHospital = hospname;
    }

    public String getAddressOfHospital() {
        return addressOfHospital;
    }

    public void setAddressOfHospital(String hospaddress) {
        this.addressOfHospital = hospaddress;
    }

    public int getAmountRequired() {
        return amountRequired;
    }

    public void setAmountRequired(int neededamtreq) {
        this.amountRequired = neededamtreq;
    }

    
    
    
}
