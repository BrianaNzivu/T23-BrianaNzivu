package org.example;

public class Switch {
    public static void main(String[] args) {
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You are an Admin");
                break;

            case "moderator":
                System.out.println("You are an Moderator");
                break;

            case "user":
                System.out.println("You are an User");
                break;
        }

    }
}
