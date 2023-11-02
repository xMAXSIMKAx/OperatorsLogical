package operatorsLogical;

import java.util.Scanner;

public class OperatorsLogical {
    static double percentageLittle;
    static double income;
    static double calculatedPercentage;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of your income\n");
        income = scanner.nextDouble();
        if (income <= 10000) {
            percentageLittle = 2.5;
            calculatedPercentage = income * percentageLittle / 100;
            System.out.println("\nyour net income is " + calculatedPercentage + " including tax 2.5%");

        } else if (income > 10000 && income <= 25000) {
            percentageLittle = 4.3;
            calculatedPercentage = income * percentageLittle / 100;
            System.out.println("\nyour net income is " + calculatedPercentage + " including tax 4.3%");

        } else if (income >= 25000) {
            percentageLittle = 4.3;
            calculatedPercentage = income * percentageLittle / 100;
            System.out.println("\nyour net income is " + calculatedPercentage + " including tax 6.7%");

        } else
            System.out.println("Error.... Try again");

    }
}
