package org.system;

class Desktop extends Computer {

    void desktopSize() {
        System.out.println("Desktop Size: 24 Inches");
    }

    public static void main(String[] args) {

        Desktop d = new Desktop();
        d.computerModel();
        d.desktopSize();
    }
}