/*
Question:

Write a Java program to calculate income tax based on the following rules:

Income <= Rs 250000        : No Tax
Rs 250001 - Rs 500000     : 5% Tax
Rs 500001 - Rs 1000000    : 20% Tax
Above Rs 1000000          : 30% Tax

Input the annual income and display the tax payable.

Example:

Input:
600000

Output:
Tax Payable = Rs 120000
*/

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Annual Income: ");
        int income = sc.nextInt();
        double tax =0;

        if(income < 0)
            System.out.println("Invalid Input");

        else if (income <= 250000)
            tax = 0;

        else if (income <= 500000)
            tax = 0.05 * income;

        else if (income <= 1000000)
            tax = 0.2 * income;

        else 
            tax = 0.3 * income;

        if (income >= 0)
            System.out.println("Payable Tax : Rs. " + tax);

sc.close();

        
    }
}
