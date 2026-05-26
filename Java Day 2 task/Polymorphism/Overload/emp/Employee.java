package org.emp;



public class Employee {

    // Method with int argument
    void empId(int id) {
        System.out.println("Employee ID: " + id);
    }

    // Method with String argument
    void empId(String name) {
        System.out.println("Employee Name: " + name);
    }

    // Method with float argument
    void empId(float salary) {
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.empId(101);
        e.empId("John");
        e.empId(25000.50f);
    }
}
