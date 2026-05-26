package org.india;

import org.andrapradesh.AndraPradesh;

public class India extends AndraPradesh {

    public void india() {
        System.out.println("India");
    }

    public static void main(String[] args) {

        India obj = new India();

        obj.india();
        obj.tamilLanguage();
        obj.malayalam();
        obj.telugu();
    }
}