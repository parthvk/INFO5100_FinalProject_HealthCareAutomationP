
package Business.Employee;

/**
 *
 * @author Parth
 */
public class Staff {
    
    private String empName;  //Employee Name
    private int empId;      //Employee ID
    private static int count = 1;           //Employee ID Count

    public Staff() {
        //Set the employeed Id as count and increment count everytime new staff is created
        empId = count;
        count++;
    }
    //Getter Setters
    public int getEmpId() {
        return empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public String getEmpName() {
        return empName;
    }

    @Override
    public String toString() {
        return empName;
    }
    
    
}
