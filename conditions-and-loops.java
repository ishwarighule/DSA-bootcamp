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

// reverse


public class Main
{
    public static void main(String[] args) {
        int num=232525;
        int ans=0;
        
        while(num>0){
            
            int rem=num%10;
            num=num/10;
            ans = ans*10 +rem;
            
        }
        
        
        System.out.println(ans);
    }
}



//calculator
import java.util.*;
public class Main
{
    public static void main(String[] args) {
        int ans=0;
        System.out.println("Enter operator");
        
        Scanner sc =new Scanner(System.in);
        char op =sc.next().trim().charAt(0);
        
        while(true){
            if(op== '+' || op== '-' ||op== '*' ||op== '/' ||op== '%'){
                 System.out.println("Enter two numbers");
                 int a = sc.nextInt();
                 int b= sc.nextInt();
                 
                
                if(op=='+'){
                    ans=a+b;
                }
                if(op=='-'){
                    ans=a-b;
                }
                if(op=='*'){
                    ans=a*b;
                }
                if(op=='/'){
                    if(b!=0){
                        ans=a/b;
                    }
                 }
                if(op=='%'){
                    ans=a%b;
                }
            }else if(op=='x'|| op=='X'){
                break;
            }
        else{
             System.out.println("Invalid operator");
        }
        
        System.out.println(ans);
    }
}
}
