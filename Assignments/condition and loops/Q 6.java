// Area Of Rhombus

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double l1,l2,area;
        System.out.print("Enter length of one side of Rhombus: ");
        l1= sc.nextDouble();
        System.out.print("Enter the length of another side of Rhombus: ");
        l2= sc.nextDouble();
        area= (l1* l2)/2 ;
        System.out.println("Area of Rhombus: "+ area);
    }
}
