package test;
import org.junit.Test;
import src.Employee;

import static java.lang.System.*;
import static org.junit.Assert.assertEquals;

public class EmployeeSalaryTest {
    @Test
    public void testEmployees1() {
        Employee employee = new Employee("John Doe","12345" ,160,10,20,15);
        String expected = "Employee Information: \n"
                + "Name: " + employee.getName()  + "\n"
                + "Code: "  + employee.getCode() + "\n"
                + "Basic Salary: " + employee.BasicSalary() + "\n"
                + "Overtime Salary: " + employee.OvertimeSalary() + "\n"
                + "Total Salary: " + employee.TotalSalary();
        String actual = employee.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testEmployees2(){
        Employee employee2 = new Employee("Trung","CH08",240,20,0,0);
        String expected = "Employee Information: \n"
                + "Name: " + employee2.getName()  + "\n"
                + "Code: "  + employee2.getCode() + "\n"
                + "Basic Salary: " + employee2.BasicSalary() + "\n"
                + "Overtime Salary: " + employee2.OvertimeSalary() + "\n"
                + "Total Salary: " + employee2.TotalSalary();
        String actual = employee2.toString();
        assertEquals(expected, actual);
    }
}
