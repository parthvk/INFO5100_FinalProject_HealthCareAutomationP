

/**
 *
 * @author Parth
 */
package Business.WorkQueue;

import Business.SystemUserAccount.SystemUsers;
import java.util.Date;

public abstract class WorkReq {

    private String wrkMsg; //Work Request Message
    private SystemUsers sndr; //Sender of work request
    private SystemUsers rcvr; //Receiver of work requests
    private String reqStatus; //Request status
    private Date dateOfReq; //Date of Request
    private Date resolvedOn; //Resolved on date
    private String typeOfTest = " "; //Type of test

    
    //Getters and Setters
    public String getTypeOfTest() {
        return typeOfTest;
    }

    public void setTypeOfTest(String bloodTestType) {
        this.typeOfTest = bloodTestType;
    }

    public WorkReq() {
        dateOfReq = new Date();
    }

    public String getWrkMsg() {
        return wrkMsg;
    }

    public void setWrkMsg(String wrkMsg) {
        this.wrkMsg = wrkMsg;
    }

    public SystemUsers getSndr() {
        return sndr;
    }

    public void setSndr(SystemUsers sndr) {
        this.sndr = sndr;
    }

    public SystemUsers getRcvr() {
        return rcvr;
    }

    public void setRcvr(SystemUsers rcvr) {
        this.rcvr = rcvr;
    }

    public String getReqStatus() {
        return reqStatus;
    }

    public void setReqStatus(String reqStatus) {
        this.reqStatus = reqStatus;
    }

    public Date getDateOfReq() {
        return dateOfReq;
    }

    public void setDateOfReq(Date dateOfReq) {
        this.dateOfReq = dateOfReq;
    }

    public Date getResolvedOn() {
        return resolvedOn;
    }

    public void setResolvedOn(Date resolvedOn) {
        this.resolvedOn = resolvedOn;
    }
}
