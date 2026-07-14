/*
Question:

A telephone department wishes to compute monthly telephone bills
according to the following rules:

- First 80 calls      : Flat charge of Rs 250
- Next 80 calls       : Rs 0.60 per call
- Next 160 calls      : Rs 0.50 per call
- Above 320 calls     : Rs 0.40 per call

Write a Java program to input the number of calls made by a customer
and calculate the total payable amount.
*/

import java.util.Scanner;

public class TelephoneBill {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of calls");
        int calls = sc.nextInt();
        double a= 0;

        if(calls <= 0)
            System.out.println("Invalid Input");

        else if(calls <=80)
           a = 250;

        else if(calls <=160)
            a= 250 + (0.60*(calls-80));
            
        else if(calls <= 320)
            a = 250 + (0.6*80) + (0.5*(calls-160));
            

        else 
            a = 250 + (0.6*80) + (0.5*160) + (0.4*(calls-320));

        if (calls > 0)
            System.out.println("Total Payable Amount = " + a);

sc.close();

     }
}
    
     

