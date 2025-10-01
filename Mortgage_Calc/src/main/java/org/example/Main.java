package org.example;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal = 0;
        double annualRate = 0;
        int years = 0;

        int step = 1; // track which input we are asking for

        while (step <= 3) {
            switch (step) {
                case 1:
                    System.out.print("Enter principal (1000 - 1,000,000): ");
                    principal = scanner.nextDouble();

                    if (principal >= 1000 && principal <= 1_000_000) {
                        step++;
                    } else {
                        System.out.println("Error: Principal must be between 1000 and 1,000,000.");
                    }
                    break;

                case 2:
                    System.out.print("Enter annual interest rate (greater than 0 and max 30): ");
                    annualRate = scanner.nextDouble();

                    if (annualRate > 0 && annualRate <= 30) {
                        step++;
                    } else {
                        System.out.println("Error: Interest rate must be > 0 and ≤ 30.");
                    }
                    break;

                case 3:
                    System.out.print("Enter loan period in years (1 - 30): ");
                    years = scanner.nextInt();

                    if (years >= 1 && years <= 30) {
                        step++;
                    } else {
                        System.out.println("Error: Loan period must be between 1 and 30 years.");
                    }
                    break;

                default:
                    // This should never happen
                    System.out.println("Unexpected step!");
                    step = 4;
                    break;
            }
        }

        // Convert to monthly rate and number of payments
        double monthlyRate = (annualRate / 100) / 12;
        int numberOfPayments = years * 12;

        // Apply mortgage formula
        double monthlyPayment = principal *
                (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) /
                (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

        // Format output as currency
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Your monthly mortgage payment is: " + currencyFormat.format(monthlyPayment));

        scanner.close();
    }
}
