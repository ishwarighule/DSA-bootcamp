// 1. Area of Circle
import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        double area=0,pi=3.14;
        System.out.print("Enter radius: ");
        Scanner sc= new Scanner(System.in);
        double r= sc.nextDouble();
        
        if (r!=0){
            area= pi*r*r;
            System.out.println("Area of Circle: "+ area);
        }else{
        System.out.println("Enter valid radius");
        }
    }
}
