// Perimeter Of Equilateral Triangle

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double a, perimeter;
        System.out.print("Enter lenth of a side of Equilateral Triangle: ");
        a= sc.nextDouble();
        perimeter = (3*a);
        System.out.println("Perimeter Of Equilateral Triangle: "+ perimeter);
    }
}
