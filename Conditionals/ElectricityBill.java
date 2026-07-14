/*
Question:

An electricity department wishes to compute electricity bills
for consumers according to the following tariff:

- Up to 100 units        : Flat charge of Rs 200
- Next 200 units         : Rs 1.00 per unit
- Next 200 units         : Rs 1.55 per unit
- Above 500 units        : Rs 2.10 per unit

Write a Java program to input:

- Consumer Name
- Consumer Number
- Previous Meter Reading
- Current Meter Reading

Calculate the units consumed and display the total
payable electricity bill.
*/

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Consumer Name");
        String name = sc.nextLine();

        System.out.println("Enter Consumer No.");
        int conum = sc.nextInt();

        System.out.println("Enter Previous Reading");
        int prevread = sc.nextInt();

        System.out.println("Enter Current Reading");
        int curread = sc.nextInt();

        double amount = 0;

        int unit = curread - prevread;

        if (unit <= 0)
            System.out.println("Invalid Input");

        else if (unit <= 100)
            amount = 200;

        else if (unit <= 300)
            amount = 200 + (1 * (unit - 100));

        else if (unit <= 500)
            amount = 200 + 200 + (1.55 * (unit - 300));

        else
            amount = 200 + 200 + (1.55 * 200) + (2.1 * (unit - 500));

        if (unit > 0) {
            System.out.println("\n==============================");
            System.out.println("      ELECTRICITY BILL");
            System.out.println("==============================");

            System.out.println("Name of the Consumer : " + name);
            System.out.println("Consumer Number      : " + conum);
            System.out.println("Total Units Used     : " + unit);
            System.out.println("Total Payable Amount : Rs " + amount);
        }

        sc.close();
    }
}