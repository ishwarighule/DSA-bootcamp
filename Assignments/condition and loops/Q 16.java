// Volume Of Cylinder

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        double r,h,volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        r = sc.nextDouble();
        System.out.println("Enter height ");
        h = sc.nextDouble();
        volume =  (r * r)* h* 3.14;
        System.out.println("Volume Of Cylinder :"+ volume);
    }
}
