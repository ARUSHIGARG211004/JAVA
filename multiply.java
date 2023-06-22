//Make a function to multiply 2 numbers and return the product.
import java.util.*;
public class multiply {
    public static int printMultiply(int a,int b){
        int multiply= a*b;
        return multiply;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number a:");
        int a=sc.nextInt();
        System.out.print("enter a number b:");
        int b=sc.nextInt();

        int multiply=printMultiply(a,b);
        System.out.println("the multiplication is:"+multiply);


    }
}