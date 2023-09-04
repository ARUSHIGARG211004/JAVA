import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int l=sc.nextInt();
        if(l%400==0 || l%4==0 && l%100!=0)
            System.out.println("it is a leap year");
        
        else
            System.out.println("it is not a leap year");
        
    }
}