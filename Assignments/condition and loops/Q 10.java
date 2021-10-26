// Perimeter Of Parallelogram 

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double b,h, perimeter;
        System.out.print("Enter base: ");
        b= sc.nextDouble();
        System.out.print("Enter height: ");
        h= sc.nextDouble();
        System.out.println("ans is: " +2*(b+h));
    }
}
