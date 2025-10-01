package org.example;

public class Strings {
    public static void main(String[] args) {
        String message = "Hello World" + "!!";

        System.out.println(message.trim());
        System.out.println(message);

        //Escape Sequence
        String message2 = "Hello \"Briana\"";
        System.out.println(message2);

        String message3 = "c:\tWindows\\...";
        System.out.println(message3);

        String message4 = "c:\nWindows\\...";
        System.out.println(message4);
    }
}
