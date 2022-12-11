/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Org.Organization;
import Business.Patient.PatientDirectory;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pratik
 */
public class EntHealthServices extends Enterprise {

    private PatientDirectory patientDirectory;
//constructor for the healthservice is declared
    public EntHealthServices(String name) {
        super(name, EnterpriseType.HealthServicesEnt);
        patientDirectory = new PatientDirectory();
    }

    @Override
    public ArrayList<Role> getSupportRole() {
        return null;
    }

    public List<Organization.Type> getAllOrgTypes() {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Doctor);
        orgTypes.add(Organization.Type.Lab);
        orgTypes.add(Organization.Type.Accountant);
        orgTypes.add(Organization.Type.BloodBank);
        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

}
