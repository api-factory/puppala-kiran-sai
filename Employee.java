package java.bean;
import java.util.HashMap;
public class Employee extends Bean
{
    HashMap<String, Employee> map;
 
    public Employee()
{
        map = new HashMap<String,Employee>();
    }

    public void add(Employee employee)
    {
        map.put(employee.getEmployeeName(), employee);
    }

    public void remove(String key)
    {
 
        map.remove(key);
    }

    public void clear()
    {
        map.clear();
    }
    
    public void print()
    {
        System.out.println("\n********Employee's in the Company.********");
        for (Employee employee : map.values())
        {
            System.out.println("Employee Name:\t" + employee.getEmployeeName());
            System.out.println("Employee Id:\t" + employee.getEmployeeId());
            System.out.println("E-mail:\t"+ employee.getEmployeeEmail());
        }
    }
    public Employee get(String name){
        return map.get(name);
    }
}