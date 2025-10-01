package org.example;

public class For_Each {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Orange", "Pear", "Strawberry"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);

        for (String fruit : fruits)
            System.out.println(fruit);
        }
    }
}
