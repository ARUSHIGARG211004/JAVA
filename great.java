
//write a function which takes 2 number and returns the greater of those two.
import java.util.*;
public class great {
    public static void printGreater(int a, int b){
        if(a>b){
            System.out.println(a);
        }
        else if(a<b){
            System.out.println(b);
        }
        else{
            System.out.println("both are equal");
        }
        return;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a:");
        int a= sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        printGreater(a,b);
    }
}