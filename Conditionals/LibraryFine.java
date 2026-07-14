/*
Question:
A library charges a fine for late return of books according to the following rules:

- Fine = Rs 2 if the book is returned within 5 days.
- Fine = Rs 4 if the book is returned after 5 days but within 10 days.
- Fine = Rs 6 if the book is returned after 10 days.

Write a Java program to input the number of days a book is overdue and calculate the applicable fine.
*/

import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of days");
        int days = sc.nextInt();
        if (days < 0)
            System.out.println("Invalid Input");
        else if(days <= 5)
            System.out.println("Fine = Rs 2");
        else if (days <= 10)
            System.out.println ("Fine = Rs 4 ");
        else
            System.out.println("Fine = Rs 6");


sc.close();

    }}
