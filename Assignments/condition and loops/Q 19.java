// Curved Surface Area Of Cylinder

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        double r,h,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        r = sc.nextDouble();
        System.out.println("Enter height ");
        h = sc.nextDouble();
        area =  2* 3.14 *r *h;
        System.out.println("Curved Surface Area Of Cylinder :"+ area);
    }
}
