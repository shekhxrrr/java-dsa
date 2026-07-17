/*
Question:

Write a Java program to input marks obtained by a student and display the corresponding grade according to the following criteria:

90 - 100 : Grade A
80 - 89  : Grade B
70 - 79  : Grade C
60 - 69  : Grade D
Below 60 : Grade F

The program should also handle invalid marks (less than 0 or greater than 100).

Example:

Input:
85

Output:
Grade = B
*/

import java.util.Scanner;

public class GradeCalculator {
    public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    
    System.out.println("Enter your marks");
    double marks = sc.nextDouble();

    if (marks < 0 || marks > 100)
        System.out.println ("Invalid Input");

    else if (marks >= 90)
        System.out.println ("Grade : A");

    else if (marks >= 80)
        System.out.println ("Grade : B");

    else if (marks >= 70)
        System.out.println ("Grade : C");

    else if (marks >= 60)
        System.out.println("Grade : D");

    else 
        System.out.println ("Grade : F");

sc.close();
    
}
}
