

/**
 *
 * @author Parth
 */
package Business.WorkQueue;

import java.util.ArrayList;

public class WorkQ {

    private ArrayList<WorkReq> wrkReqs; //List of work requests
//Getters and Setters
    public WorkQ() {
        wrkReqs = new ArrayList();
    }

    public ArrayList<WorkReq> getWrkReqs() {
        return wrkReqs;
    }
}
