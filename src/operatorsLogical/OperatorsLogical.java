package operatorsLogical;

import java.util.Scanner;

public class OperatorsLogical {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of your income\n");
        double income = scanner.nextDouble();
        if (income <= 10000) {
            double percentageLittle = 2.5;
            double calculatedPercentage = income * percentageLittle / 100;
            System.out.println("\nyour net income is " + calculatedPercentage + " including tax 2.5%");

        } else if (income > 10000 && income <= 25000) {
            double percentageLittle = 4.3;
            double calculatedPercentage = income * percentageLittle / 100;
            System.out.println("\nyour net income is " + calculatedPercentage + " including tax 4.3%");

        } else if (income >= 25000) {
            double percentageLittle = 6.7;
            double calculatedPercentage = income * percentageLittle / 100;
            System.out.println("\nyour net income is " + calculatedPercentage + " including tax 6.7%");

        } else
            System.out.println("Error.... Try again");

    }
}
