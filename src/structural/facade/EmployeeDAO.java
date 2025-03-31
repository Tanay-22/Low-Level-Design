package structural.facade;

public class EmployeeDAO
{
    public void insert()
    {
        // insert into Employee Table
    }

    public void updateEmployeeName(int employeeId)
    {
        // find and update Employee Name
    }

    public Employee getEmployeeDetails(String emailId)
    {
        // find Employee
        return new Employee();
    }
}
