class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    void setDetails(int id, String name, double sal) {
        employeeId = id;
        employeeName = name;
        salary = sal;
    }

    void calculateYearlySalary() {
        double yearlySalary = salary * 12;

        System.out.println("Employee Details");
        System.out.println("-------------------------");
        System.out.println("Employee ID    : " + employeeId);
        System.out.println("Employee Name  : " + employeeName);
        System.out.println("Monthly Salary : " + salary);
        System.out.println("Yearly Salary  : " + yearlySalary);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setDetails(101, "Vishnu", 50000);
        emp.calculateYearlySalary();
    }
}