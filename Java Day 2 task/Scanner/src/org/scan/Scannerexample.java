package org.scan;
import java.util.Scanner;

public class Scannerexample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        
        System.out.print("Enter Mark1: ");
        int mark1 = sc.nextInt();

        System.out.print("Enter Mark2: ");
        int mark2 = sc.nextInt();

        System.out.print("Enter Mark3: ");
        int mark3 = sc.nextInt();

        System.out.print("Enter Mark4: ");
        int mark4 = sc.nextInt();

        System.out.print("Enter Mark5: ");
        int mark5 = sc.nextInt();

        
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;

       
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Total Marks  : " + total);
        System.out.println("Average Marks: " + average);

        sc.close();
    }
}