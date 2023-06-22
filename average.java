
//Enter 3 number from the user and make a function to print their average.
import java.util.*;
public class average {
    public static int printAverage(int a,int b,int c){
        int average= (a+b+c)/2;
        return average;

    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number a:");
        int a= sc.nextInt();
        System.out.print("enter number b:");
        int b= sc.nextInt();
        System.out.print("enter number c:");
        int c= sc.nextInt();
        int average= printAverage(a,b, c);
        System.out.println("the average is="+average);
    }

}