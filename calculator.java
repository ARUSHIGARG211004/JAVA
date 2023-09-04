import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a operator:");
        char ch=sc.next().charAt(0);
        System.out.print("enter 1st number:");
        int a=sc.nextInt();
        System.out.print("enter 2nd number:");
        int b=sc.nextInt();
        switch(ch){
            case('+'):
                int c=a+b;
                System.out.println(c);
                break;
            case('-'):
                int d=a-b;
                System.out.println(d);
                break;
            case('*'):
                int e=a*b;
                System.out.println(e);
                break;
            case('/'):
                int f=a/b;
                System.out.println(f);
                break;
            
            
            
            
            
        }
        
        
    }
}