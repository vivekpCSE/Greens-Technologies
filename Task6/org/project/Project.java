package org.project;

import org.emp.Employee;
import org.company.Company;
import org.client.Client;

public class Project {

    public void projectName() {
        System.out.println("Project Name : Employee Management System");
    }

    public static void main(String[] args) {

      
        Employee emp = new Employee();
        emp.empName();
        Company comp = new Company();
        comp.companyName();
        Client client = new Client();
        client.clientName();
   
        Project proj = new Project();
        proj.projectName();
    }
}