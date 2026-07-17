/*
Question:

Write a Java program to input three numbers and determine the largest among them.

Example:

Input:
12
45
20

Output:
Largest Number = 45

The program should work correctly for positive, negative, and equal numbers.
*/


import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main (String [] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println ("Enter three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c)
            System.out.println ( "Largest Number is : " + a);

        else if (b >= a && b >= c)
            System.out.println ( "Largest Number is : " + b);

        else 
            System.out.println ( "Largest Number is : " + c);

sc.close();
            
    }
    
}
