import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        int b=sc.nextInt();
       // int c=a>b;
        switch(a>b?1:0){
            case 0:
                System.out.println(b+"is greater");
                break;
            case 1:
                System.out.println(a+"is greater");
                break;
           /* default:
            System.out.println("Both are equal");*/
        }
            
        }
    }
