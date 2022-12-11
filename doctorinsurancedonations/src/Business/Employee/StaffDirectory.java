
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Parth
 */
public class StaffDirectory {

    private ArrayList<Staff> empList;  //List of Staff

    //Getters and Setters
    public StaffDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Staff> getEmpList() {
        return empList;
    }

    //Creating new employee, adding it to the list of employee and returning the new employee
    public Staff createEmployee(String name) {
        Staff employee = new Staff();
        employee.setEmpName(name);
        empList.add(employee);
        return employee;
    }
}
