// Area Of Equilateral Triangle

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double a,area;
        System.out.print("Enter length of side of Equilateral Triangle: ");
        a= sc.nextDouble();
        area = ( 1.73 * a*a) / 4 ;
        System.out.println("Area of Equilateral Triangle: "+ area);
    }
}
