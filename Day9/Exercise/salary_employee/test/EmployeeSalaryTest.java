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
                + "Name: John Doe"  + "\n"
                + "Code: 12345"  + "\n"
                + "Basic Salary: " + 1600 + "\n"
                + "Overtime Salary: " + 300 + "\n"
                + "Total Salary: " + 1900;
        String actual = employee.toString();
        assertEquals(expected, actual);
    }
    @Test
    public void testEmployees2(){
        Employee employee2 = new Employee("Trung","CH08",240,20,0,0);
        String expected = "Employee Information: \n"
                + "Name: Trung"  + "\n"
                + "Code: CH08"  + "\n"
                + "Basic Salary: " + (240*20) + "\n"
                + "Overtime Salary: " + 0 + "\n"
                + "Total Salary: " + (240*20);
        String actual = employee2.toString();
        assertEquals(expected, actual);
    }
}
