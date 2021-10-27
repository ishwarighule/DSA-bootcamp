// Volume Of Prism

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter height");
        double h = sc.nextDouble();
        System.out.println("Enter width");
        double w = sc.nextDouble();
        double perimeter ;
        perimeter =  l*w*h ;
        System.out.println(" Volume Of Prism is " +perimeter);
    }
}
