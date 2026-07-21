/*
Question:

Create a class Area to demonstrate Method Overloading.

Overload the method area() as follows:

1. area(int side)
   - Calculate and display the area of a square.

2. area(int length, int breadth)
   - Calculate and display the area of a rectangle.

3. area(double radius)
   - Calculate and display the area of a circle.

Formulae:

Area of Square    = side × side
Area of Rectangle = length × breadth
Area of Circle    = π × radius²

In the main() method:

- Accept the side of the square.
- Accept the length and breadth of the rectangle.
- Accept the radius of the circle.
- Invoke the appropriate overloaded area() methods.
- Display the calculated areas.

Sample Input:

Side = 4
Length = 5
Breadth = 6
Radius = 7

Sample Output:

Area of Square: 16
Area of Rectangle: 30
Area of Circle: 153.94

Purpose:

To understand:
- Method Overloading
- Compile-time Polymorphism
- Passing different parameter lists
- Mathematical calculations using overloaded methods
*/

import java.util.Scanner;
    
    public class Area {

        public static void area (int side)
        {
            int square = side * side;
            System.out.println("Area Of Square: " + square);
        }

        public static void area (int length, int breadth)
        {
            int rectangle = length * breadth;
            System.out.println("Area of Rectangle: " + rectangle);
        }

        public static void area(double radius)
        {
            double circle = Math.PI * (radius *radius);
            System.out.println("Area of Circle: %.2f%n" + circle);
        }
        public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);
            System.out.print("Enter side of square: ");
            int side = sc.nextInt();
            System.out.print("Enter length of rectangle: ");
            int length = sc.nextInt();
            System.out.print("Enter breadth of rectangle: ");
            int breadth = sc.nextInt();
            System.out.print("Enter radius of circle: ");
            double radius = sc.nextDouble();

            area(side);
            area(length, breadth);
            area(radius);

sc.close();
            
        }

    }
    
/* 
Time Complexity : O(1)
Space Complexity: O(1)
*/