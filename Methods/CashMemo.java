/*
Question:

A shopkeeper sells products identified by a Product Code.

Create a method:

product(int productCode, int unitPrice,
        int quantity, double discount)

The method should:

1. Calculate Total Price
   Total Price = Unit Price × Quantity

2. Calculate Discount Amount

3. Calculate Net Payable Amount

4. Return the Net Payable Amount

In the main() method:

- Accept Product Code
- Accept Unit Price
- Accept Quantity
- Accept Discount Percentage

Invoke the product() method and display:

- Product Code
- Unit Price
- Quantity Purchased
- Discount Applied
- Net Payable Amount

Sample Input:
Product Code : 101
Unit Price   : 100
Quantity     : 2
Discount     : 10

Sample Output:
Product Code : 101
Unit Price : 100
Quantity of Product : 2
Discount Applied : 10
Net Payable Amount : 180.0
*/

import java.util.Scanner;

public class CashMemo {
    
    public static double product (int productcode, int unitp, int quantity, double discount){
        
        double totalprice = unitp * quantity;
        double discountedprice = ((discount/100) * totalprice);
        double netprice = totalprice - discountedprice;
        return netprice;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Product Code");
        int productcode = sc.nextInt();
        System.out.println("Enter Unit Price of the Product");
        int unitp = sc.nextInt();
        System.out.println("Enter Quantity of the Product");
        int quantity = sc.nextInt();
        System.out.println("Enter Discount");
        double discount = sc.nextDouble();

        System.out.println ("Product Code : " + productcode);
        System.out.println ("Unit Price : " + unitp);
        System.out.println ("Discount Applied :" + discount);
        System.out.println ("Quantity of Product : " + quantity);

        double netprice = product (productcode, unitp, quantity, discount);
        System.out.println ("Net Payable Amount : " + netprice);

sc.close();


    }
}
