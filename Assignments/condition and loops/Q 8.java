// Perimeter Of Circle

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double r,perimeter, pi=3.14;
        System.out.print("Enter radius of circle: ");
        r= sc.nextDouble();
        perimeter = (2*pi*r);
        System.out.println("Perimeter Of Circle: "+ perimeter);
    }
}
