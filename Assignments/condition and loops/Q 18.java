// Volume Of Pyramid

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        double l,w,h,volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        l = sc.nextDouble();
        System.out.println("Enter height ");
        h = sc.nextDouble();
        System.out.println("Enter width ");
        w = sc.nextDouble();
        volume =  (l*w*h)/ 3;
        System.out.println("Volume Of Pyramid :"+ volume);
    }
}
