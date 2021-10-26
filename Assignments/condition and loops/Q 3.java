//3. Area of rectangle

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double length,width,area;
        System.out.print("Enter length: ");
        length= sc.nextDouble();
        System.out.print("Enter width: ");
        width= sc.nextDouble();
        area= (length*width);
        System.out.println("Area of Rectangle: "+ area);
    }
}
