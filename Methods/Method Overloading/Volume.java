import java.util.Scanner;

    public class Volume {

        public static double volume (double r){
            return ((4.0/3.0) * Math.PI * r * r);

        } 
        public static double volume (double cylinderHeight, double cylinderRadius){
            return (Math.PI * cylinderRadius * cylinderRadius * cylinderHeight);
        }
        public static double volume (double length, double breadth, double cuboidHeight){
            return (length * breadth * cuboidHeight);
        }
        public static void main ( String [] args ){

            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the Radius of Sphere");
            double r= sc.nextDouble();
            System.out.println("Enter Height of Cylinder");
            double cylinderHeight= sc.nextDouble();
            System.err.println("Enter Radius of Cylinder");
            double cylinderRadius= sc.nextDouble();
            System.out.println("Enter Length of Cuboid");
            double length= sc.nextDouble();
            System.out.println("Enter Breadth of Cuboid");
            double breadth= sc.nextDouble();
            System.out.println("Enter Height of Cuboid");
            double cuboidHeight= sc.nextDouble();

            System.out.printf ("Volume of Sphere is: %.2f%n" , volume(r));
            System.out.printf ("Volume of Cylinder is: %.2f%n" , volume(cylinderHeight,cylinderRadius));
            System.out.printf ("Volume of Cuboid is: %.2f%n", volume(length, breadth, cuboidHeight));

sc.close();
        }
    }       