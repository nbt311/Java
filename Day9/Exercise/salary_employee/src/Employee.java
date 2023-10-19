package src;

public class Employee {
    private String name;
    private String code;
    private int number_work_times_per_month;
    private int basic_salary_per_hour;
    private int number_overtime;
    private  int salary_overtime;



    public Employee() {
    }

    public Employee(String name, String code, int number_work_times_per_month, int basic_salary_per_hour, int number_overtime, int salary_overtime) {
        this.name = name;
        this.code = code;
        this.number_work_times_per_month = number_work_times_per_month;
        this.basic_salary_per_hour = basic_salary_per_hour;
        this.number_overtime = number_overtime;
        this.salary_overtime = salary_overtime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber_work_times_per_month() {
        return number_work_times_per_month;
    }

    public void setNumber_work_times_per_month(int number_work_times_per_month) {
        this.number_work_times_per_month = number_work_times_per_month;
    }

    public int getBasic_salary_per_hour() {
        return basic_salary_per_hour;
    }

    public void setBasic_salary_per_hour(int basic_salary_per_hour) {
        this.basic_salary_per_hour = basic_salary_per_hour;
    }

    public int getNumber_overtime() {
        return number_overtime;
    }

    public void setNumber_overtime(int number_overtime) {
        this.number_overtime = number_overtime;
    }

    public int getSalary_overtime() {
        return salary_overtime;
    }

    public void setSalary_overtime(int salary_overtime) {
        this.salary_overtime = salary_overtime;
    }

    public int BasicSalary(){
        return  this.getNumber_work_times_per_month() * this.getBasic_salary_per_hour();
    }

    public int OvertimeSalary(){
        return  this.getNumber_overtime() * this.getSalary_overtime();
    }

    public int TotalSalary(){
        return this.BasicSalary() + this.OvertimeSalary();
    }

    public String toString(){
        return "Employee Information: \n"
                +"Name: " + this.getName() + "\n"
                +"Code: " + this.getCode() + "\n"
                +"Basic Salary: " + this.BasicSalary() + "\n"
                +"Overtime Salary: " + this.OvertimeSalary() + "\n"
                +"Total Salary: " + this.TotalSalary();
    }
}
