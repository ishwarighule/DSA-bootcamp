// Area Of Parallelogram

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double height,base,area;
        System.out.print("Enter height: ");
        height= sc.nextDouble();
        System.out.print("Enter base: ");
        base= sc.nextDouble();
        area= (base * height) ;
        System.out.println("Area of Parallelogram: "+ area);
    }
}
