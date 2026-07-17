/*
Question:

Create a class CountDigitOccurrence with a method:

counter(long num, int digit)

The method should:

1. Accept a number and a digit.
2. Count how many times the given digit
   occurs in the number.
3. Return the total occurrence count.

In the main() method:

- Accept a number from the user.
- Accept a digit to search.
- Invoke the counter() method.
- Display the total number of occurrences.

Sample Input:

Number : 479292
Digit  : 9

Sample Output:

Digit 9 appears in 479292 a total of 2 times.

Purpose:

To understand methods with parameters,
return values, loops, and digit extraction
using the modulus (%) and division (/)
operators.
*/

import java.util.Scanner;

public class CountDigitOccurence {

    public static int counter (long num, int digitToFind){
        int count= 0;

        while (num > 0) {
        int digit = (int) num % 10;
        if (digitToFind == digit)
            count++;
        num = num /10;
        }
        return count;
    }

    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number");
        long num = sc.nextLong();
        System.out.println("Enter the Digit");
        int digitToFind= sc.nextInt();

        System.out.println ("Digit " + digitToFind + " appears in " + num + " a total of " + counter(num,digitToFind) + " times");

sc.close();

    }
}
    

