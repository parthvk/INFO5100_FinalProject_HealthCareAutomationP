

package Business.Patient;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Parth
 */

public class PatientDirectory {
    //List of patient as a directory is being maintained for healthcare 
    private List<Patient> patients = new ArrayList<>();//List of Patients

    //Getters and Setters
    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    
}
