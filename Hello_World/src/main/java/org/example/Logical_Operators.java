package org.example;

public class Logical_Operators {
    public static void main(String[] args) {

        //AND operator
        int temprature = 22;
        boolean isWarm = temprature > 20 && temprature < 30;
        System.out.println(isWarm);

        //OR operator
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean criminalRecord= false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !criminalRecord;


    }
}
