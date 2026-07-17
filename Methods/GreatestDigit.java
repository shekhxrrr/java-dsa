/*
Question:

Create a class GreatestDigit with a method:

maxDigit(long num)

The method should:

1. Accept a positive integer.
2. Find the greatest (largest) digit present in the number.
3. Return the greatest digit.

In the main() method:

- Accept a number from the user.
- Invoke the maxDigit() method.
- Display the greatest digit.

Sample Input:
Number : 483729

Sample Output:
Greatest Digit : 9

Purpose:

To understand methods with return values,
digit extraction using modulus (%) and division (/),
comparison using loops,
and finding the maximum digit in a number.
*/


import java.util.Scanner;

public class GreatestDigit {
    
    public static int maxDigit(long num) {
        int lastDigit= 0;
        int greatestDigit = (int) (num % 10);
        

        while(num > 0){
            lastDigit= (int) (num % 10);
            if(lastDigit > greatestDigit)
                greatestDigit = lastDigit;
            num = num / 10;
        }

        return greatestDigit;
    }

        public static void main(String [] args){

            Scanner sc = new Scanner (System.in);
            System.out.println("Enter Number");
            long num = sc.nextLong();
            
            System.out.println("Greatest Digit in: " + num + " is " + maxDigit(num));



sc.close();


        }
}