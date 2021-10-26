// 2. Area Of Triangle

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double b,h,area;
        System.out.print("Enter base: ");
        b= sc.nextDouble();
        System.out.print("Enter height: ");
        h= sc.nextDouble();
        area= (b*h)/2;
        System.out.println("Area of Triangle: "+ area);
    }
}
