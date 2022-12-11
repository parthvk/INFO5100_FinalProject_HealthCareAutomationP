
package Business.Patient;

import Business.InsuranceCustomer.InsuranceCustomer;

/**
 *
 * @author Parth
 */
public class Patient {

    private String patId;//Patient ID
    private String patLstNm;//Patient Last Name
    private String patFrstNm;//Patient First Name
    private String ssn;//Patient SSN
    private String patAge;
    private String cntctNo;//Patient Contact Number
    private String address;
    private String gender;
    private boolean isTrtmntdone;//Is the treatment done
    private String aptDt;//Appointment Date
    private String patmail;//Email Id of patient
    private String docType;

    //Getters and Setters
    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getPatmail() {
        return patmail;
    }

    public void setPatmail(String patmail) {
        this.patmail = patmail;
    }

    private InsuranceCustomer insuranceCustomer;

    public Patient() {

    }

    public String getPatLstNm() {
        return patLstNm;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPatAge() {
        return patAge;
    }

    public void setPatAge(String patAge) {
        this.patAge = patAge;
    }

    public String getCntctNo() {
        return cntctNo;
    }

    public void setCntctNo(String cntctNo) {
        this.cntctNo = cntctNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getPatId() {
        return patId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPatFrstNm(String patFrstNm) {
        this.patFrstNm = patFrstNm;
    }

    public String getSsn() {
        return ssn;
    }

    @Override
    public String toString() {
        return String.valueOf(patId);
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public boolean isIsTrtmntdone() {
        return isTrtmntdone;
    }

    public void setIsTrtmntdone(boolean isTrtmntdone) {
        this.isTrtmntdone = isTrtmntdone;
    }

    public String getAptDt() {
        return aptDt;
    }

    public void setAptDt(String aptDt) {
        this.aptDt = aptDt;
    }

    public void setPatLstNm(String patLstNm) {
        this.patLstNm = patLstNm;
    }

    public String getPatFrstNm() {

        return patFrstNm;

    }

}
