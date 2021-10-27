//Volume Of Cone Java Program

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
        double r = sc.nextDouble();
        System.out.println("Enter height");
        double h = sc.nextDouble();
        double perimeter ;
        perimeter =  3.14 * r*r *h * 1/3 ;
        System.out.println(" Volume Of Cone is " +perimeter);
    }
}
