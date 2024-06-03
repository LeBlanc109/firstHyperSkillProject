package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Section 1
        System.out.println("Prices:");
        System.out.println("Bubblegum: $2");
        System.out.println("Toffee: $0.2");
        System.out.println("Ice cream: $5");
        System.out.println("Milk chocolate: $4");
        System.out.println("Doughnut: $2.5");
        System.out.println("Pancake: $3.2");

         */


        /*Section 2 Earned Amount
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println("");
        System.out.println("Income: $5405.0");
         */

        //Section 3 Calculate Net Income
        Scanner scanner = new Scanner(System.in);




        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $202");
        System.out.println("Toffee: $118");
        System.out.println("Ice cream: $2250");
        System.out.println("Milk chocolate: $1680");
        System.out.println("Doughnut: $1075");
        System.out.println("Pancake: $80");
        System.out.println("");
        System.out.println("Income: $5405.0");
        System.out.println("Staff expenses:");

        //Asked for Staff Expenses
        int staffExpenses = scanner.nextInt();

        //Print Staff Expenses
        System.out.println(staffExpenses);


        System.out.println("Other expenses:");

        //Asked for Other Expenses
        int otherExpenses = scanner.nextInt();

        //Print Other Expenses
        System.out.println(otherExpenses);

        int netTotal = staffExpenses + otherExpenses - 5405;
        System.out.println("Net income: $" + netTotal);









    }
}