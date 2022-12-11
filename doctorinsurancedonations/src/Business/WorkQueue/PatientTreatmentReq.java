
package Business.WorkQueue;

import Business.Patient.Patient;
import Business.SystemUserAccount.SystemUsers;

/**
 *
 * @author Parth
 */
public class PatientTreatmentReq extends WorkReq {

    private String registrationDate; //Registration Date
    private String visitReason; //Reason for visit
    private Patient patient; 
    private String typeOfLabTest; //Type of Lab Test
    private String resultFromLab; //Result from Lab
    private SystemUsers labAssitantEmployee; //Lab Assistant Employee
    private String msgFromLabTest; //Message from lab Test
    private String drNote; //Doctor Note
    private double totalBill; //Total Bill
    private SystemUsers drAssignd; //Docotr Assigned
    private int bloodUnits; //Units of Blood Required
    private String msgFromBloodBank; //Message from Blood Bank
    private SystemUsers bloodBankManagement; //Blood Bank Management

    
    //Getters and Setters
    public SystemUsers getBloodBankManagement() {
        return bloodBankManagement;
    }

    public void setBloodBankManagement(SystemUsers bloodBankManagement) {
        this.bloodBankManagement = bloodBankManagement;
    }

    public int getBloodUnits() {
        return bloodUnits;
    }

    public void setBloodUnits(int bloodUnits) {
        this.bloodUnits = bloodUnits;
    }

    public String getMsgFromBloodBank() {
        return msgFromBloodBank;
    }

    public void setMsgFromBloodBank(String msgFromBloodBank) {
        this.msgFromBloodBank = msgFromBloodBank;
    }

    public PatientTreatmentReq(String Date, String reasonForVisit, Patient patient) {
        this.registrationDate = Date;
        this.visitReason = reasonForVisit;
        this.patient = patient;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String Date) {
        this.registrationDate = Date;
    }

    public String getVisitReason() {
        return visitReason;
    }

    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getTypeOfLabTest() {
        return typeOfLabTest;
    }

    public void setTypeOfLabTest(String typeOfLabTest) {
        this.typeOfLabTest = typeOfLabTest;
    }

    public String getResultFromLab() {
        return resultFromLab;
    }

    public void setResultFromLab(String resultFromLab) {
        this.resultFromLab = resultFromLab;
    }

    public SystemUsers getLabAssitantEmployee() {
        return labAssitantEmployee;
    }

    public void setLabAssitantEmployee(SystemUsers labAssitantEmployee) {
        this.labAssitantEmployee = labAssitantEmployee;
    }

    public String getMsgFromLabTest() {
        return msgFromLabTest;
    }

    public void setMsgFromLabTest(String msgFromLabTest) {
        this.msgFromLabTest = msgFromLabTest;
    }

    public String getDrNote() {
        return drNote;
    }

    public void setDrNote(String drNote) {
        this.drNote = drNote;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    public SystemUsers getDrAssignd() {
        return drAssignd;
    }

    public void setDrAssignd(SystemUsers drAssignd) {
        this.drAssignd = drAssignd;
    }

    @Override
    public String toString() {
        return visitReason;
    }

}
