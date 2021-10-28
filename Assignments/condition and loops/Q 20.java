// Total Surface Area Of Cube

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        double l,area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of one side of cube ");
        l = sc.nextDouble();
        area =  6*l*l;
        System.out.println("Total Surface Area Of Cube :"+ area);
    }
}
