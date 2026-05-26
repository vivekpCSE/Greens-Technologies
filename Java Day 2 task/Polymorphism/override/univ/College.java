package org.univ;

public class College extends University {

    // Overriding ug() method
    @Override
    void ug() {
        System.out.println("UG Course: B.Tech Information Technology");
    }

    // Overriding pg() method
    @Override
    void pg() {
        System.out.println("PG Course: MBA");
    }

    public static void main(String[] args) {

        College c = new College();

        c.ug();
        c.pg();
    }
}