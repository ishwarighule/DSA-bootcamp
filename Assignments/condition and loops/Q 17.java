// Volume Of Sphere

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        double r,h,volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius ");
        r = sc.nextDouble();
        volume =  (r * r*r)* 3.14 * 4/3;
        System.out.println("Volume Of Sphere :"+ volume);
    }
}
