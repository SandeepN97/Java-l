package day11;

//Q1:- Create a Class Employee with 4 Attributes with EmployeeID , EmployeeName , EmployeeSalary , EmployeeAge.
// Create getter and Setter. For EmployeeId all the id less than 0 is unauthorized.
public class Employee {
    int employeeId;
    String employeeName;
    double employeeSalary;
    int employeeAge;

    public int getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public double getEmployeeSalary() {
        return employeeSalary;
    }
    public int getEmployeeAge() {
        return employeeAge;
    }
    public void setEmployeeId(int employeeId) {
        if(employeeId < 0) {
            System.out.println("Unauthorized");
        } else {
            this.employeeId = employeeId;
        }
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setEmployeeAge(int employeeAge) {
        this.employeeAge = employeeAge;
    }

}
