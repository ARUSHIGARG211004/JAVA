//Write a java program to find the first and last digit of a number.
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n number:"+" ");
        int n=sc.nextInt();
        int d=n%10;
        while(n>=10)
            n=n/10;
        System.out.println("the last digit is "+d);
        System.out.println("the first digit is "+n);
        
    }
}