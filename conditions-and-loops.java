// 1. Largest of 3 numbers

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        
        int max = a;
        if(b>a){
            max =b;
        }
        
        if(c>max){
            max =c;
        }
        
        System.out.println("largest is  " + max);
        
    }
}



//2. Counting a particular number in set

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        int a=2344546;
        int count=0;
        
        while(a> 0){
            
            int rem = a%10;
            if(rem==4){
                count++;
            }
            
            a= a/10;
        }
        System.out.println("count is  " + count);
        
    }}




