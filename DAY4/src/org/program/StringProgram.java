package org.program;
import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQ1");
        String str1 = "GreensTechnology";
        String str2 = "SeleniumAutomationtool";
        String str3 = "velmurugan";
        String str4 = "j a v a p r o g r a m";
        String str5 = "9944152058";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println(str3.length());
        System.out.println(str4.length());
        System.out.println(str5.length());

        System.out.println("\nQ2");
        System.out.println(str1.lastIndexOf('o'));
        System.out.println(str2.indexOf('o'));
        System.out.println(str3.indexOf('n'));
        System.out.println(str4.lastIndexOf(' '));
        System.out.println(str5.indexOf('8'));

        System.out.println("\nQ3");
        System.out.println(str1.charAt(5));
        System.out.println(str2.charAt(10));
        System.out.println(str3.charAt(5));
        System.out.println(str4.charAt(12));
        System.out.println(str5.charAt(7));

        System.out.println("\nQ4");
        System.out.println("Enter First String:");
        String s1 = sc.nextLine();

        System.out.println("Enter Second String:");
        String s2 = sc.nextLine();

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Both Strings are Equal");
        } else {
            System.out.println("Both Strings are Not Equal");
        }

        System.out.println("\nQ5.1");
        System.out.println("enter mail:");
        String mail = sc.nextLine();
        System.out.println(mail.contains("@"));

        System.out.println("\nQ5.2");
        System.out.println("Enter Address:");
        String address = sc.nextLine();
        System.out.println(address.matches(".*\\d{6}.*"));

        System.out.println("\nQ5.3");
        System.out.println("number:");
        String num = sc.nextLine();
        System.out.println(num.matches(".*[a-zA-Z].*"));

        System.out.println("\nQ6");
        System.out.println("mobilenum:");
        String mobile = sc.nextLine();

        if (mobile.length() == 10) {
            System.out.println("valid");
        } else {
            System.out.println("Invalid");
        }

        System.out.println("\nQ7");
        String rep = "welcome to java";
        System.out.println(rep.replaceAll("java", "sql"));

        System.out.println("\nQ7.4");
        System.out.println("enter gmail:");
        String mail2 = sc.nextLine();

        if (mail2.contains("gmail")) {
            mail2 = mail2.replace("gmail", "yahoo");
        }
        System.out.println(mail2);

        System.out.println("\nQ7.5");
        System.out.println("enter Address:");
        String address2 = sc.nextLine();

        if (address2.matches(".*\\d{6}.*")) {
            address2 = address2.replaceAll("\\d{6}", "");
        }
        System.out.println(address2);

        System.out.println("\nQ8");
        System.out.println("enter string:");
        String str6 = sc.nextLine().toLowerCase();
        System.out.println(str6);

        System.out.println("\nQ8.4");

        System.out.println("enter string:");
        String str7 = sc.nextLine();

        int upper = 0, lower = 0;

        for (int i = 0; i < str7.length(); i++) {
            char ch = str7.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
        }

        System.out.println("UpperCase=" + upper);
        System.out.println("LowerCase=" + lower);

        System.out.println("\nQ11.3");
        String a = new String("OMR");
        String b = new String("Thoraipakkam");
        String c = a + b;

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));

        System.out.println("\nQ11.4");
        String d = "OMR";
        String e = "Thoraipakkam";
        String f = "OMRThoraipakkam";

        System.out.println(System.identityHashCode(d));
        System.out.println(System.identityHashCode(e));
        System.out.println(System.identityHashCode(f));

        System.out.println("\nQ12.1");
        String s7 = "Welcome to java class";

        String[] words = s7.split(" ");
        for (String w : words) {
            System.out.println(w);
        }

        System.out.println("\nQ12.2");

        String[] words1 = s7.split("l");
        for (String w : words1) {
            System.out.println(w);
        }

        System.out.println("\nQ13");
        System.out.println(s7.substring(0, 7));

        System.out.println("\nQ14");

        String str10 = "Welcome";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str10.length(); i++) {
            char ch = str10.charAt(i);

            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {

                if ("aeiouAEIOU".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("vowels = " + vowels);
        System.out.println("consonants = " + consonants);

        System.out.println("\nQ15");

        String str = "Welcome To Java class @123";

        int caps = 0, small = 0, numbers = 0, special = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                caps++;
            } else if (Character.isLowerCase(ch)) {
                small++;
            } else if (Character.isDigit(ch)) {
                numbers++;
            } else {
                special++;
            }
        }

        System.out.println("caps count : " + caps);
        System.out.println("small count : " + small);
        System.out.println("number count : " + numbers);
        System.out.println("special char : " + special);

        System.out.println("\nQ16");

        String str11 = "welcome";

        for (int i = 0; i < str11.length(); i++) {
            char ch = str11.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                str11 = str11.replace(ch, '@');
            }
        }

        System.out.println(str11);

        sc.close();
    }
}