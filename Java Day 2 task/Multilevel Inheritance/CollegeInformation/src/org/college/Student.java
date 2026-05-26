package org.college;

class Student extends Hostel {
    void studentName() {
        System.out.println("Student Name: John");
    }

    void studentDept() {
        System.out.println("Student Department: CSE");
    }

    void studentId() {
        System.out.println("Student ID: 1001");
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.collegeName();
        s.collegeCode();
        s.collegeRank();

        s.deptName();

        s.hostelName();
        
        s.studentName();
        s.studentDept();
        s.studentId();
    }
}