package org.example;

import java.util.Scanner;

public class Reading_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are" + age);
    }
}
