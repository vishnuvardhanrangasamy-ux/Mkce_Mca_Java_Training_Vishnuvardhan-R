 class Person {
    String name;
    int age;
    double salary;
    String company;
}

class Employee extends Person {
    void display() {
        System.out.println("Employee Details");
        System.out.println("----------------");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Salary  : " + salary);
        System.out.println("Company : " + company);
    }
}
    public class main {
      public static void main(String[] args) {
        Employee emp = new Employee();

        emp.name = "John";
        emp.age = 25;
        emp.salary = 50000;
        emp.company = "ABC Pvt Ltd";

        emp.display();
    }
}
