package structural.facade;

public class EmployeeFacade
{
    EmployeeDAO employeeDAO;

    public EmployeeFacade()
    {
        this.employeeDAO = new EmployeeDAO();
    }

    public void insert()
    {
        employeeDAO.insert();
    }

    public void updateEmployeeName(int employeeId)
    {
        employeeDAO.updateEmployeeName(employeeId);
    }

    public Employee getEmployeeDetails(String emailId)
    {
        return employeeDAO.getEmployeeDetails(emailId);
    }
}
