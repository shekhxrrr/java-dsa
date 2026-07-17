/*
Question:

Create a class SpecialNumber with the following methods:

1. factorial(int y)
   - Accept a single digit.
   - Calculate and return the factorial of the digit.

2. printSpecial(int num)
   - Accept an integer.
   - Extract each digit of the number.
   - Invoke the factorial() method for every digit.
   - Find the sum of the factorials of all digits.
   - Check whether the sum is equal to the original number.
   - Display whether the number is a Special Number or not.

Definition:

A Special Number is a number whose sum of the
factorials of its digits is equal to the number itself.

Example:

145

1! = 1
4! = 24
5! = 120

1 + 24 + 120 = 145

Hence,
145 is a Special Number.

In the main() method:

- Accept an integer from the user.
- Invoke the printSpecial() method.

Sample Input:
145

Sample Output:
Number 145 is a Special Number

Purpose:

To understand:
- Methods with return values
- Method calling another method
- Loops
- Digit extraction using modulus (%) and division (/)
- Factorial calculation
- Number-based programming
- Code reusability using methods
*/


import java.util.Scanner;

public class SpecialNumber {

    public static int factorial (int y){
        int fact =1;

            for (int i= y; i > 1; i--){
                fact = fact * i;
                } 
                
    return fact;
        }

    public static void printSpecial(int num){
        int digit;
        int sum = 0;
        int temp = num;
        
        while (temp > 0){
            digit = temp % 10;
            int factorialValue= factorial (digit);
            sum = sum + factorialValue;
            temp = temp / 10;
        }

        if(num == sum)
            System.out.println("Number " + num + " is a Special Number");
        else
            System.out.println("Number " + num + " is not a Special Number");
    }
    public static void main ( String [] args){

        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Number");
        int num = sc.nextInt();

        printSpecial(num);

sc.close();
    }
}

/*
Time Complexity  : O(d)
Space Complexity : O(1)

where,
d = Number of digits in the input number.
*/
