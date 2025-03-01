package proxydesignpattern;

public class EmployeeDaoImpl implements EmployeeDao
{
    @Override
    public void create(String client, EmployeeDo obj)
    {
        System.out.println("Created new row in the Employees table");
    }

    @Override
    public void delete(String client, int employeeId)
    {
        System.out.println("Deleted row with employeeId: " + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId)
    {
        // fetch row
        System.out.println("Fetch data from the DB");
        return new EmployeeDo();
    }
}
