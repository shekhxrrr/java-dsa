/*
Question:

A hotel charges room rent according to the following tariff:

- First 3 days      : Rs 350 per day
- Next 3 days       : Rs 300 per day
- Next 3 days       : Rs 275 per day
- Beyond 9 days     : Rs 225 per day

Write a Java program to input:
- Name of the customer
- Number of days stayed
- Check-in date
- Check-out date

Calculate and display the total payable amount along with customer details.
*/

import java.util.Scanner;

public class HotelTariff {

    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your Name");
        String name = sc.nextLine();
        System.out.println("Number of Days Stayed");
        int days = sc.nextInt();
        System.out.println("Check-in Date");
        int date = sc.nextInt();
        System.out.println("Check-out Date");
        int date2 = sc.nextInt();
        double amount = 0;

        if (days <= 0)
            System.out.println("Invalid Input");

        else if (days <= 3)
            amount = (350*days);

        else if (days <= 6)
            amount = (350*3) + (300*(days-3));

        else if (days <= 9)
            amount = (350*3) + 300*3 + (275*(days-6));

        else
            amount = (350*3) + (300*3) + (275*3) + (225*(days-9));

        if(days > 0)
System.out.println("\n================================");
System.out.println("           XYZ HOTEL");
System.out.println("================================\n");            System.out.println("Name of Person : " + name);
            System.out.println("Number of Days Stayed : " + days);
            System.out.println("Check-in Date : " + date);
            System.out.println("Check-out Date : " + date2);
            System.out.println("Payable Amount : Rs. " + amount);


sc.close();
    }
    
}
