// Perimeter Of Rectangle

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        double l = sc.nextDouble();
        System.out.println("Enter width");
        double w = sc.nextDouble();
        double perimeter ;
        perimeter = 2 *(l+w);
        System.out.println("Perimeter Of Rectangle is " +perimeter);
    }
}
