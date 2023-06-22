//Make a function to add 2 numbers and return the sum.

import java.util.*;
public class sum {
    public static int printSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number a:");
        int a=sc.nextInt();
        System.out.print("enter a number b:");
        int b=sc.nextInt();
        int sum=printSum(a,b);
        System.out.println("the sum is:"+sum);
    }
}